package com.company;

public class Main {

    public static void main(String[] args) {

        int[] sayilar = {10, 13, 3, 5, 8};
        int aranacak =13;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
            }

        }
        if (varMi == true) {
            System.out.println("Sayi mevcuttur");

        } else {
            System.out.println("Sayi mevcut degil");
        }
    }
}
