package com.green.day5_0320;

public class Switch4 {
    public static void main (String[] args) {
        int score = 83;
        int val1 = score / 10;
        int val2 = score % 10;
        /*
            <조건>
            일의자리 숫자가
            0~2 -
            3~6 0
            7~9 +
         */
        System.out.println(score + "점");

        String grade = switch (val1) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "F";
        };
        System.out.println(grade + " 입니다.");

    }
}
