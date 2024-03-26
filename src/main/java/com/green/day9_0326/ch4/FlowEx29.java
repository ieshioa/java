package com.green.day9_0326.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        /*
        1~100
        3 6 9
         */
//        for (int i = 1; i <= 100; i++) {
//            System.out.printf("i = %d ", i);
//            int D1 = i / 10;
//            int D2 = i % 10;
//            if (D1 == 3 || D1 == 6 || D1 == 9) {
//                System.out.print("짝");
//            }
//            if (D2 == 3 || D2 == 6 || D2 == 9) {
//                System.out.print("짝");
//            }
//            System.out.println();
//        }
//        System.out.println();

        // 형우씨
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("i = %d ", i);
            int n = i;
            while (n != 0) {
                int n2 = n % 10;
                if (n2 == 3 || n2 == 6 || n2 == 9) {
                    System.out.print("짝");
                }
                n /= 10;
            }
                System.out.println();
        }
    }
}
