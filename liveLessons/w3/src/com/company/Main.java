package com.company;

public class Main {

    public static void main(String[] args) {
        //Klasik başlangıç
        System.out.println("-Hello world-");

       // Değişken tanımlama camelCase kullanımı

        //if else uygulaması
        double dolarDun = 18.30;
        double dolarBugun = 18.40;

        boolean dolarDustuMu=false;
        String okYonu="";

        if(dolarBugun<dolarDun)
        {
            okYonu="down.svg";
            System.out.println(okYonu);
        }
            else if(dolarBugun>dolarDun)
            {
                okYonu="up.svg";
                System.out.println(okYonu);

             }
             else
             {
                okYonu="equal.svg";
                System.out.println(okYonu);
            }

             //Diziler ve döngü kullanımı

            String[] krediler ={"Hızlı kredi","Maasini Halkabanktan","Mutlu Emekli"};

             for(int i=0;i<krediler.length;i++)
             {
                 System.out.println(krediler[i]);
             }
        }
}

