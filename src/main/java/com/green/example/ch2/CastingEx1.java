package com.green.example.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score = " + score);
        System.out.println("d = " + d);             // 형변환이 이루어져도 피연산자에는 아무런 변화가 없다.
    }
}
