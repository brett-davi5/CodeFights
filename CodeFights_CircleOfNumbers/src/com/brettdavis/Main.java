package com.brettdavis;

public class Main {

    public static void main(String[] args) {

        System.out.println(circleOfNumbers(10, 2));
        System.out.println(circleOfNumbers(10, 7));
        System.out.println(circleOfNumbers(4, 1 ));
        System.out.println(circleOfNumbers(6, 3));

    }

    public static int circleOfNumbers(int n, int firstNumber){
        int alphaNumber = (int) n / 2;

        if(n < 4 && n > 20)
            return 0;
        else if(firstNumber > n)
            return 0;
        else if(firstNumber < alphaNumber)
            return firstNumber + alphaNumber;
        else if(firstNumber > alphaNumber)
            return (firstNumber + alphaNumber) % 10;
        else
            return 0;
    }
}
