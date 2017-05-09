package com.brettdavisgame.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing Cases: ");
        System.out.println(lateRide(240));
        System.out.println(lateRide(808));
        System.out.println(lateRide(1439));
        System.out.println(lateRide(0));
        System.out.println(lateRide(23));
        System.out.println(lateRide(8));

        System.out.println("Testing stuff: ");

        System.out.println(808/60);

        double remainderCheck = (808%60);
        System.out.println(remainderCheck);




    }

    public static int lateRide(int n){
        int alphaNumber = (int) n / 60;

        int bravoNumber = (int) n % 60;

        int minutes = (int) (bravoNumber);

        int hour10 = (int) alphaNumber / 10;

        int hour1 = (int) alphaNumber % 10;

        int minutes10 = (int) minutes / 10;

        int minutes1 = (int) minutes % 10;

        return hour10 + hour1 + minutes10 + minutes1;
    }
}
