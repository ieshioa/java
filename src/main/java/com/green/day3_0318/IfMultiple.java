package com.green.day3_0318;

public class IfMultiple {
    public static void main(String[] args) {
        int val1 = 10, val2 = 100;

        // 1짝수 2짝수 > val2 - val1 출력
        // 1짝수 2홀수 > 그대로
        // 1홀수 2짝수 > val2 - 5 값을 출력
        // 1홀수 2홀수 > 그대로


        if (val1 % 2 == 0) {
            if(val2 % 2 == 0) {
                System.out.println(val2 - val1);
            } else {
                System.out.println(val1 + ", " + val2);
            }
        } else {
            if(val2 % 2 == 0) {
                System.out.println(val2 - 5);
            } else {
                System.out.println(val1 + ", " + val2);
            }
        }
    }
}
