package com.brettdavis;

public class Main {

    public static void main(String[] args) {

        System.out.println(maxMultiple(3, 10));
        System.out.println(maxMultiple(2, 7));
        System.out.println(maxMultiple(10, 50));
        System.out.println(maxMultiple(7, 100));
    }

   public static int maxMultiple( int divisor, int bound){

        int dividedNumber = (int) bound/divisor;
        int returnNumber = (int) dividedNumber * divisor;
        int divisorCheck = (int) (returnNumber % divisor);


        if(divisorCheck != 0 ){
            return 0;
        }else if(returnNumber > bound)
            return 0;
        else if(returnNumber <= 0)
            return 0;
        else
            return returnNumber;
    }
}
