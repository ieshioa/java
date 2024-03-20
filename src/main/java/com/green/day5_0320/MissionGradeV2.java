package com.green.day5_0320;

public class MissionGradeV2 {
    public static void main(String[] args) {
        /*
            <조건>
            -10 ~ 120 스코어
            일의자리 숫자가
            0~2 -
            3~6 0
            7~9 +
         */
        int score = (int)(Math.random() * 131) -10;
        //int score = 100;
        int val1 = score / 10;  // 십의자리수
        int val2 = score % 10;  // 일의자리수
        int val3 = 0;           // F판단
        String grade = null;    // 등급
        String grade2 = "";     // + - 0
        System.out.println(score + "점");

        if (score < 0 || score > 100) {  // 0~100이 아닌 점수 예외
            System.out.println("점수가 잘못되었습니다.");
        } else {
            grade = switch (val1) {         // 등급
                case 10 -> {                // 100점은 A+ 고정
                    val3 = 1;
                    yield "A+";
                }
                case 9 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                default -> {
                    val3 = 1;
                    yield "F";
                }
            };
            if (val3 == 0) {                // + - 0
                grade2 = switch (val2) {
                    case 0, 1, 2 -> "-";
                    case 3, 4, 5, 6 -> "0";
                    default -> "+";
                };
            }
            System.out.printf("당신의 학점은 %s%s 입니다.", grade, grade2);
        }
    }
}
