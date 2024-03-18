package com.green.day3;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        // 2 ~ 9단 랜덤하게
        int dan = (int)(Math.random() * 8) + 2;
        System.out.println(dan + "단");
        for(int i=0; i<9; i++) {
            int num = i + 1;
            System.out.println(dan + " X " + num + " = " + (dan * num));
        }
    }
}
