package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
    public void add(Course course){
        System.out.println("JDBC ile "+course.getCourseId()+" id numaralı kurs veritabanına eklendi");
    }
}
