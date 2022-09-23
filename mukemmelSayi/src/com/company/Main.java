package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 28;
        int toplam=0;
        for (int i = 1; i < x; i++)
        {
            if(x%i==0) toplam=toplam+i;

        }
        if(toplam==x)
        {
            System.out.println("Sayi mükemmeldir");
        }
        else
        {
            System.out.println("Sayi mükemmel değildir");
        }
    }
}