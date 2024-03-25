package com.green.day8_0325.ch4;

public class Test {
    public static void main(String[] args) {

        String url = "www.green.com";
        float f1 = .10f; //0.10f 와 동일
        double d = 1.23556789;

        float f2 = 1.123456789123456789f;  // 정확: 5자리 유효자릿수: 7
        double d2 = 0.123456789123456711113456789;  // 정확 14자리 유효 16자리
        System.out.println(f2);
        System.out.println(d2);
        System.out.println();

        System.out.printf("f1=%f\n", f1);
        System.out.println();

        System.out.printf("d=%f\n", d);
        System.out.println();

        System.out.printf("d=[%.2f]\n", d); //3자리에서 반올림 처리 됨
        System.out.printf("d=[%10.2f]\n", d); //반올림 처리 됨
        System.out.printf("d=[%010.2f]\n", d); //반올림 처리 됨
        System.out.println();

        System.out.printf("url=%s\n", url);
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);  // 8자리만 나옴
    }
}
