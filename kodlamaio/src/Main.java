import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcEducatorDao;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {

    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(),new FileLogger()};  // loglama kurs için
        Logger[] loggers1={new MailLogger()};                        // loglama kategori için
        Logger[] loggers2={new FileLogger(),new MailLogger()};       // loglama eğitmen için    3 ü için  farklı loglama işlemi hazır


        Course course1 =new Course(101,"Yazılım Kampı -JAVA",185);   // ürün özellikleri eklendi
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);  // kurs için  veritabanı ve log seçildi
        courseManager.add(course1);   //kurs kurallara uygun bir şekilde eklendi

        Course course2 =new Course(102,"Programlamaya Giriş",0);
        courseManager.add(course2);

        Category category1=new Category(201,"Programlama");  // kategori eklendi
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers1); //kategori için veritabanı ve log seçildi
        categoryManager.add(category1);

        Educator educator1 =new Educator(301,"Engin","Demirog");
        EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(),loggers2);
        educatorManager.add(educator1);

        Educator educator2= new Educator(301,"Engin","Simsek" );
        educatorManager.add(educator2);






    }
}












/*    kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs bölümlerini katmanlı mimaride kodlamak istiyoruz.

        Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.

        Çoklu loglama yapısını simule ediniz.

        Aşağıdaki isterleri gerçekleştiriniz.

        Kurs ismi tekrar edemez
        Kategori ismi tekrar edemez
        Bir kursun fiyatı 0 dan küçük olamaz
        Kodlarınızı github'a aktarınız

        Diğer arkadaşlarınızın kodlarını inceleyip beğenirseniz yıldızlayınız.

        Not: Aldığınız yıldızlar github sayfa kaliteniz için sektörde çok belirleyicidir.*/