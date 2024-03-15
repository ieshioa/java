package com.green.day2;

public class MissionOddEven {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10) + 1;  // 1 ~ 10

        // 예) num이 5라면 - 홀수입니다
        //  10이라면 짝수입니다 출력
        System.out.print(num);
        if((num % 2) == 0) {
            System.out.println("은(는) 짝수입니다.");
        } else {
            System.out.println("은(는) 홀수입니다.");
        }

    }
}
