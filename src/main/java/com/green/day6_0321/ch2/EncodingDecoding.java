package com.green.day6_0321.ch2;

public class EncodingDecoding {
    public static void main(String[] args) {
        //int 한글 = 1;
        char c = 'B';
        //int i = (int)c;
        int i = c; //자동현변환, 인코딩 암호화

        char c2 = (char)i; //디코딩 복호화

        System.out.printf("c: %c, i: %d, c2: %c\n", c, i, c2);
    }
}