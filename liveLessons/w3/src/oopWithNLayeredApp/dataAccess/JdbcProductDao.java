package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements  ProductDao {
    public void add(Product product){
        //db erişim kodları buraya yazılır ...SQL ögren!!
        System.out.println("JDBC ile veri tabanına eklendi");
    }
}
