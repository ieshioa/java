package com.green.day5_0320.ch2;

public class VarEx2 {
    public static void main(String[] args){
        int x = 10, y = 20;
        System.out.println("x: " + x + ", y: " + y);

        /*
        x가 가지고 있는 값과 y가 가지고 있는 값을
        서로 교환 한다.
        조건1) 리터럴 값은 사용할 수 없습니다.
        조건2) 조건 1만 지키면 무엇이든지 해도 됨.
        x=20 y=10
         */

        int z = 0;
        z = x;  // z=10
        x = y;  // x=20
        y = z;  // y=10

        System.out.println("x: " + x + ", y: " + y);

    }
}