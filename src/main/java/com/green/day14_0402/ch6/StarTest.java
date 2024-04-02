package com.green.day14_0402.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5); // *****(\n)
        star.singlePrint(7); // *******(\n)
        System.out.println("----------------");
        star.squarePrint(5);
        star.trianglePrint(4);
    }
}

class Star {
    void singlePrint(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void squarePrint(int n) {
        for (int i = 0; i < n; i++) {
            singlePrint(n);
        }
    }
    void trianglePrint(int n) {
        for (int i = 1; i <= n; i++) {
            singlePrint(i);
        }
    }
}
