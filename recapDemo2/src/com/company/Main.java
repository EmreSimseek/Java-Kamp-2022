package com.company;

public class Main {

    public static void main(String[] args) {

        int[] myList ={5,8,20,3,-1,0};
        int total=0;int max=0;
        for(int number:myList)
        {
            if(max<number)
            {
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
             System.out.println("Toplam =" +total);
             System.out.println("En büyük=" +max);
    }
}
