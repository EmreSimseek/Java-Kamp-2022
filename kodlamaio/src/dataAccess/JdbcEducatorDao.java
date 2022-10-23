package dataAccess;

import entities.Educator;

public class JdbcEducatorDao implements EducatorDao{
    public void add(Educator educator){
        System.out.println("Jdbc ile "+educator.getEducatorName()+educator.getEducatorLastName()+" eğitmen olarak veri tabanına eklendi");
    }
}
