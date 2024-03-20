package com.green.day5_0320.ch2;

public class PrintFormat {
    public static void main(String[] args) {
        /*
            `
         */
        char c = 'A';
        int finger = 10;
        long big = 100_000_000_000L;  // _ 없는거랑 똑같다. 콤마 찍는 느낌
        System.out.printf("c=%c, %d\n", c, (int)c);
        System.out.printf("finger = [%5d]\n", finger);
        System.out.printf("finger = [%-5d]\n", finger);
        System.out.printf("finger = [%05d]\n", finger);
        System.out.println(big);

        int year = 2024;
        int mon = 3;
        int day = 20;
        //yyyy-mm-dd
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);
    }
}

