package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private List<Category> categories;
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        categories = new ArrayList<Category>();

    }



    public void add(Category category) throws Exception {

        for (Category categoryA : categories) {
            if (category.getCategoryName().equals(categoryA.getCategoryName())) {
                throw new Exception("Kategori ismi aynı olamaz");
            }
        }

        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}