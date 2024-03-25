package com.green.day7_0322.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        /*
                <조건>
                Scanner를 통해 정수를 입력받으세요
                점수는 정수로 바로 받으시고,
                grade 관리할 문자타입을 선언해주세요
                만약 점수가 90점 이상이라면 A
                80점 이상이면 B
                70점 이상이면 C
                70점 미만이면 D

                당신의 학점은 ? 입니다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요. >> ");
        String scoreStr = scan.nextLine();
        int score = Integer.parseInt(scoreStr);

        while (score < 0 || score > 100){
            System.out.print("점수를 다시 입력해주세요. >> ");
            scoreStr = scan.nextLine();
            score = Integer.parseInt(scoreStr);
        }
        scan.close();  // 사용하고나면 반납해줘야한다. 지금은 짧기때문에 안해줘도 되지만 하는게 맞다

        String grade = switch (score / 10) {
            case 10,9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "D";
        };
        System.out.printf("당신의 학점은 %s 입니다.", grade);
    }
}
