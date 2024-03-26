package com.green.example.ch2;

public class PrintEx1 {
    public static void main(String[] args) {
        /*
        정수값을 지시자를 사용하여 printf()로 출력하기
        출력될 값이 차지할 공간 지정하기
         */

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000L;            // _ 는 아무 의미 없음
                                            // 없는거나 마찬가지임
                                            // 그냥 숫자 보기 편하게 하기 위함
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;  // 16진수

        int octNum = 010;                   // 8진수 10, 10진수로는 8
        int hexNum = 0x10;                  // 16진수 10, 10진수로는 16
        int binNum = 0b10;                  // 2진수 10, 10진수로는 2

        System.out.printf("b =\t%d\n", b);
        System.out.printf("s =\t%d\n", s);
    }
}
