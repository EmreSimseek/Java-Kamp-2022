
import  java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayac = 0;
        int sayi = input.nextInt();
        int i;


            for (i = 1; i < sayi; i++)
            {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if(sayi<2) System.out.println("Gecersiz sayi");
            System.exit(0);

            if (sayac >= 2)
            {
                System.out.println(sayi + " sayisi asal degildir");
            }
            else
            {
               System.out.println(sayi + " sayisi asaldir");
            }

    }
}