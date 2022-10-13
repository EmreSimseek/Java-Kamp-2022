public class Main {

    public static void main(String[] args) {
   /*  BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger()};
     for(BaseLogger logger:loggers) // tüm hedeflere loglama işlemi
     {
         logger.Log("Log mesajı");
     }

    } */
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();


    }
}