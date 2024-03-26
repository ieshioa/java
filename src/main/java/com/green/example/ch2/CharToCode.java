package com.green.example.ch2;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;     // ch에 저장된 값을 int타입으로 변환

        System.out.printf("%c = %d(%#X)\n", ch, code, code);            // 유니코드, 16진수

        char hch = '가';     // char hch = 0xAC00;
        System.out.printf("%c = %d(%#X)\n", hch, (int)hch, (int)hch);   // 유니코드, 16진수
    }
}
