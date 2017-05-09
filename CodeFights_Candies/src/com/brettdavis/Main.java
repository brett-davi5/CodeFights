package com.brettdavis;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(candies(3, 10));
        System.out.println(candies(1, 2));
        System.out.println(candies(10, 5));
        System.out.println(candies(4,4));

    }

    public static int candies(int n, int m){


        int number = (int) m/n;
        return number * n;

    }


}
