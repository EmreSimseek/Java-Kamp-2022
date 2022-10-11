package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;
import java.util.logging.Logger;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public  ProductManager(ProductDao productDao,Logger[]){
        this.productDao=productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception{
        // iş kuralları
        if(product.getUnitPrice()<10)
        {
           throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
        for(Logger logger: loggers)
        {
            logger.log(product.getName());
        }
    }
}
