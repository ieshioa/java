package com.green.example.ch1;

public class VarEx2 {
    public static void main(String[] args) {
        /*
        두 변수(x, y)의 값 교환하기
         */
        int x = 10, y = 20;
        int tmp = 0;        // 변수가 하나 더 필요하다.

        System.out.println("x: " + x + ", y: " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + ", y: " + y);

    }
}
