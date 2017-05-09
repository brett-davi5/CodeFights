package com.brettdavis;

public class Main {

    public static void main(String[] args) {

        System.out.println(seatsInTheater(16, 11, 5, 3));
        System.out.println(seatsInTheater(1, 1, 1, 1));
        System.out.println(seatsInTheater(13, 6, 8, 3));
        System.out.println(seatsInTheater(60, 100, 60, 1));
        System.out.println(seatsInTheater(1000, 1000, 1000, 1000));

    }


    public static int seatsInTheater(int nCols, int nRows, int col, int row){

        int rowFinal = (int) nRows - row;
        int colFinal = (int) (nCols - col) + 1;

        return rowFinal * colFinal;

    }
}
