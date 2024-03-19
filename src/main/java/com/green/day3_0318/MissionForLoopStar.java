package com.green.day3_0318;

public class MissionForLoopStar {
    public static void main(String[] args) {

        // 3 ~ 10 랜덤 값이 변수에 대입되도록
        int star = (int)(Math.random() * 8 + 3);
        System.out.println(star);
/*
    <조건>
    만약 스타=5
    * 5개 찍기
     10이면 10개 찍기
 */

        for(int i = 0; i<star; i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int i = star; i > 0 ; i--) {
            System.out.print("*");
        }

    }
}
