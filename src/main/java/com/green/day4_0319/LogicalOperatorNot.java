package com.green.day4_0319;

public class LogicalOperatorNot {
    public static void main(String[] args) {

        boolean r = true && true && true;

        System.out.println("r : " + r);

        System.out.println("!r : " + !r);

        // != 비교연산자
        // ! 논리연산자
        // toggle처리에 사용 (스위치, on/off)\

        int tg = 0;
        tg = 1 - tg;
        System.out.println("tg: " + tg);
        tg = 1 - tg;
        System.out.println("tg: " + tg);
        tg = 1 - tg;
        System.out.println("tg: " + tg);



    }
}
