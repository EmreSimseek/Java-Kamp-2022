import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //5 sayıdan en büyüğü bulan program
       int x,i=0; int enbuyuk=0;
       Scanner input = new Scanner(System.in);

       while(i<=5)
       {
            System.out.print("Bir sayi girin:");
            x=input.nextInt();
       if(x>enbuyuk)
           enbuyuk=x;

           i++;
       }
            System.out.print("En buyuk sayi:"+enbuyuk);
    }
}

