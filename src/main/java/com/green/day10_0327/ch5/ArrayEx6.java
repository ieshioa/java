package com.green.day10_0327.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        /*
        스코어에서 가장 큰값 작은값 출력
        min 33
        max 100
         */
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int min = score[0];
        int max = score[0];
        for (int i=0; i<score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            } else if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
