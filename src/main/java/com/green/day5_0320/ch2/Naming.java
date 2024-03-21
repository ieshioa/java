package com.green.day5_0320.ch2;

import java.io.PrintStream;

public class Naming {
    public static void main(String[] args){
        int x = 10;  // 리터럴 = 10;
        /*
        네이밍 규칙
        1. 변수, 메소드 명명규칙
                1) 대소문자 구분, 길이제한 X
                     int abc, Abc, aBc, abC;
                     int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
                2) 예약어 사용금지
                     int public;   // x
                     int void;     // X
                     int String    // 클래스명이라 가능은 하나 사용하지 않는것이 좋다.
                3) 숫자로 시작 x, 시작만 아니면 어느 위치든 상관없다.
                     int 1abc;   // x
                4) 특수기호는 _ v $ 만 허용된다.
                     int _123, $123;
                5) 여러 단어로 구성된 이름은 카멜 케이스 기법을 사용한다. (첫단어만 첫글자 소문자 뒤에는 대문자)
                      ex) lastIndexOf, happySundayMorning

         2. 클래스 명명규칙
                1) 첫글자는 무조건 대문자로 시작
                2) 여러 단어로 구성된 이름은 첫글자는 모두 대문자로 한다.(파스칼 케이스 기법)
                      ex) LastIndexOf, StringBuffer

         3. 상수 명명규칙 ( 데이터 타입 앞에 final 키워드가 들어간다.)
                1) 상수 이름은 모두 대문자로 한다.
                2) 단어 구분은 _ 로 한다.
                      ex) LAST_INDEX_OF, STRING_BUFFER
                      final int LAST_INDEX_OF = 10;
                3) 위 방식은 String, primitive type일 때 하는 편이다.
                      ex) final String NAME = "홍길동";
         */

        PrintStream ps = System.out;



    }
}
