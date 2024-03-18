package com.green.day3_0318;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        // 2 ~ 9단 랜덤하게
        int dan = (int)(Math.random() * 8) + 2;
        System.out.println(dan + "단");
        for(int i=1; i<10; i++) {
          //  System.out.println(dan + " X " + i + " = " + (dan * i));
            System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
        }

    }
}