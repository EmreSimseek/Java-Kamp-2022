package oop1;

public class Main {

    public static void main(String[] args) {
        // String mesaj ="Vade oranı";

        Product product1 = new Product(); //Class tanımlama

        product1.setName("Delongi kahve makinesi");      // -set value-     product1 ürününün değerleri dolduruldu
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");  // uygun jpg dosyasını ekledik

       // System.out.println(product1.name); // get işlemi

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products ={product1,product2,product3};

        for (Product product/*takma isim*/ :products){   // products dizisi içindeki degerleri gezme
            System.out.println(product.getName());

        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5375391010");
        individualCustomer.setFirstName("Emre");
        individualCustomer.setLastName("Simsek");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("053333333");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers ={individualCustomer,corporateCustomer};
    }
}
