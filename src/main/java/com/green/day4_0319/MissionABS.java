package com.green.day4_0319;

public class MissionABS {
    public static void main(String[] args) {

        // 절댓값
        int val = (int)(Math.random() * 21) - 10;  // 0 ~ 20 > -10 ~ 10
        System.out.println(val);

        if (val < 0) {
            val *= -1;  // 원본값은 안건드는게 좋음 > 새로운 변수를 지정
        }

        System.out.println("절댓값: " + val);

        // 다른 방법
        // System.out.println("결과값: " + (val < 0 ? -val : val));
    }
}
