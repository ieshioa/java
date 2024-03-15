package com.green.day2;

//비교연산자
public class CompOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        boolean r1 = 10 > 9;  // 10은 9보다 초과?
        System.out.println(r1);

        r1 = 10 < 9;  // 10은 9보다 미만?
        System.out.println(r1);

        r1 = 10 >= 9;  // 10은 9보다 이상?
        System.out.println(r1);

        r1 = 10 >= 10;  // 10은 10보다 이상?
        System.out.println(r1);

        r1 = 10 <= 9;  // 10은 9보다 이하?
        System.out.println(r1);

        r1 = 10 == 10;  // 10은 10과 같나?
        System.out.println(r1);

        r1 = 10 != 10;  // 10은 10과 다른가?
        System.out.println(r1);


    }
}
