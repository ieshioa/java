package com.green.day8_0325.ch4;

public class Test2 {
    public static void main(String[] args){
        float f1 = 0.123456789123456789f;
        float f2 = 1.123456789123456789f;
        float f3 = 10.123456789123456789f;
        float f4 = 100.123456789123456789f;
        float f5 = 1000.123456789123456789f;
        float f6 = 10000.123456789123456789f;

        System.out.println(f1);  // 정수부분 포함해서 최대 8자리가 출력된다.
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

        System.out.println();
        System.out.printf("%.8f\n", f1);  // 소수점 8자리까지 보여줌
        System.out.printf("%.8f\n", f2);

        System.out.println("---------------------");
        double d1 = 0.123456789123456789;
        double d2 = 1.123456789123456789;
        double d3 = 10.123456789123456789;
        double d4 = 100.123456789123456789;
        double d5 = 1000.123456789123456789;
        double d6 = 10000.123456789123456789;

        System.out.println(d1);  // 정수부분 포함해서 최대 17자리가 출력된다.
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        System.out.println();
        System.out.printf("%.8f\n", d1);  // 소수점 8자리까지 보여줌
        System.out.printf("%.8f\n", d2);
    }
}
