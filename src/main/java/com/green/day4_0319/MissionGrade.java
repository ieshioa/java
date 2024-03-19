package com.green.day4_0319;

public class MissionGrade {
    public static void main(String[] args) {

        /*
            <조건>
            score = 0 ~ 100 랜덤
            점수가 90점 이상이면 당신의 학점은 A입니다.
            80점 이상이면 B입니다.
            70점 이상이면 C입니다.
            나머지는 F입니다.
         */

        int score = (int)(Math.random() * 101);
        char grade = ' ';

        System.out.println("점수: " + score);
        System.out.print("당신의 학점은 ");

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'c';
        } else {
            grade = 'F';
        }

        System.out.println(grade + " 입니다.");
        System.out.printf("%c 입니다", grade);

    }
}
