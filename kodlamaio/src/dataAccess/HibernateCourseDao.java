package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {
    public void add(Course course){
        System.out.println("Hibernate ile "+course.getCourseId()+" id numaralı kurs veri tabanına eklendi");
    }
}
