package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses;
    private CourseDao courseDao;
    private Logger[] loggers;


    public CourseManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
        courses = new ArrayList<Course>();
    }

    public void add(Course course) throws Exception{

        if(course.getCoursePrice()<0)
        {
            throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
        }
        for(Course courseA:courses)
        {
            if(course.getCourseName().equals(courseA.getCourseName()))
            {
                throw new Exception("Kurs ismi aynı olamaz");
            }
        }

        courseDao.add(course);
        for(Logger logger :loggers){
            logger.log(course.getCourseName());
        }



    }



}




























