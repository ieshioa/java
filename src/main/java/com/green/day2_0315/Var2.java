package com.green.day2_0315;

public class Var2 {
    int gNum; // 전역변수
    public static void main(String[] args) {

        // 변수 선언과 동시에 초기화
        int num = 10, num2 = 11, num3 = 0;  // 지역변수

        num3 = num + num2;

        num3 = num3 + 3;

        System.out.println(num3);

        num3++;
        System.out.println(num3);

    }
}
