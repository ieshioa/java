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

        System.out.println("점수: " + score);
        System.out.print("당신의 학점은 ");

        char grade = 'F';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }

        System.out.println(grade + " 입니다.");
        System.out.printf("%c 입니다", grade);
        System.out.println();

        String g = "F";

        switch (score/10) {
            case 10:
            case 9:
                g = "A";
                break;
            case 8:
                g = "B";
                break;
            case 7:
                g = "C";
                break;
        }
        System.out.println(g + " 입니다.");

    }
}
