package com.green.example.ch2;

public class StringEx {
    public static void main(String[] args) {
        /*
        문자열 결합
         */
        String name = "Ja" + "va";      // 문자열 + 문자열 = 문자열 합치기
        String str = name + 8.0;        // 문자열 + 숫자 = 숫자가 문자열로 바뀜
                                        // "Java" + 8.0
                                        // = "Java" + "8.0" = "Java8.0"

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
    }
}
