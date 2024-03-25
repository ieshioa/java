package com.green.day7_0322.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        /*
                <조건>
                무식하게 해결하기
                하나하나

                grade
                symbol

                Scanner를 통해 정수를 입력받으세요
                점수는 정수로 바로 받으시고,
                grade 관리할 문자타입을 선언해주세요
                만약 점수가 90점 이상이라면 A
                80점 이상이면 B
                나머지 C

                일의자리가
                0~2 -
                3~6 0
                7~9 +
                단, c는 오로지 c만!

                당신의 학점은 ? 입니다
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요. >> ");
        String scoreStr = scan.nextLine();
        int score = Integer.parseInt(scoreStr);

        String grade = "C";
        String symbol = "";

        if (score == 100) {
            grade = "A";
            symbol = "+";
        } else if (score >= 90) {
            grade = "A";
            if(score % 10 < 3) {
                symbol = "-";
            } else if (score % 10 > 6) {
                symbol = "+";
            } else {
                symbol = "0";
            }
        } else if (score >= 80) {
            grade = "B";
            if(score % 10 < 3) {
                symbol = "-";
            } else if (score % 10 > 6) {
                symbol = "+";
            } else {
                symbol = "0";
            }
        }

        System.out.printf("당신의 학점은 %s%s 입니다.", grade, symbol);
    }
}