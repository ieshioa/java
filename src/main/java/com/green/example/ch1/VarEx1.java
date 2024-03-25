package com.green.example.ch1;

public class VarEx1 {
    public static void main(String[] args) {
        /*
        변수를 선언하고 값을 저장하기 (초기화)
        변수에 저장된 값을 읽어오기
         */
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
