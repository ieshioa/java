package com.green.day8_0325.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        while (i != 0) {        // 5 4 3 2 1
            System.out.printf("%d - I can do it.\n", i);
            i--;
        }
        System.out.println("--");

        i = 5;
        while (i != 0) {        // 4 3 2 1 0
            System.out.printf("%d - I can do it.\n", --i);
        }
        System.out.println("--");

        i = 5;
        while (i-- != 0) {      // 4 3 2 1 0
            System.out.printf("%d - I can do it.\n", i);
        }
        System.out.println("--");

        i = 5;
        while (--i != 0) {      // 4 3 2 1
            System.out.printf("%d - I can do it.\n", i);
        }
        System.out.println("--");
    }
}
