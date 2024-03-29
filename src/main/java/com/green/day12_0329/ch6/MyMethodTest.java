package com.green.day12_0329.ch6;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.checkOddEven(10);    // 짝수입니다
        mm.checkOddEven(11);    // 홀수입니다
        mm.checkOddEven(100);    // 짝수입니다
        mm.checkOddEven(13);    // 홀수입니다

        int r = mm.abs(10);
        System.out.println(r);  // 10

        r = mm.abs(-8);
        System.out.println(r); // 8

        int randomValue = mm.getRandomValue(10);  // 0~9
        System.out.println(randomValue);
        randomValue = mm.getRandomValue(100);     // 0~99
        System.out.println(randomValue);

        mm.printGugudan(3);

        int randomValue2 = mm.getRandomValue(10, 20);  // 10 ~ 19
        System.out.println(randomValue2);
        randomValue2 = mm.getRandomValue(5, 31);  // 5 ~ 30
        System.out.println(randomValue2);
    }
}

class MyMethod {
    int getRandomValue (int n) {
        return (int)(Math.random() * n);
    }
    void checkOddEven(int n) {
        System.out.println(n % 2 == 0 ? "짝수입니다." : "홀수입니다.");
    }
    int abs(int n) {
       // return n < 0 ? -n : n;
        if (n < 0) {
            n = -n;
        }
        return n;
    }
    void printGugudan (int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }

    int getRandomValue (int min, int max) {
        return (int)(Math.random() * (max-min)) + min;
    }
}