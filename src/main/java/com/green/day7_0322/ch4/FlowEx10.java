package com.green.day7_0322.ch4;

public class FlowEx10 {
    public static void main(String[] args) {
        /*
                <조건>
                스위치
                90점 이상 A
                80 B
                70 C
                나머지 F
                10의자리 숫자 뽑아내서 스위치
         */

        int score = (int)(Math.random() * 101);
        System.out.println(score+ "점");

        char g = switch (score / 10) {
            case 10,9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'F';
        };

        System.out.printf("당신의 학점은 %c입니다.\n", g);
        System.out.print("---------------------------------");

    }
}
