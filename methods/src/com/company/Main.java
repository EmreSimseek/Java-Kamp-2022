package com.company;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }




    public static void sayiBulmaca(){
        int[] sayilar = {10, 13, 3, 5, 8};
        int aranacak =13;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
            }

        }
        if (varMi) {
            mesajVer("Sayi mevcuttur:"+aranacak);

        } else {
            mesajVer("Sayi mevcut degil:"+aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
