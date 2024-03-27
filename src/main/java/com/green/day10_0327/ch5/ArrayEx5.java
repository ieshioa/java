package com.green.day10_0327.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        /*
            학생들의 국어점수입니다
            총점과 평점 출력해주세요
            소수 2자리까지
         */
        int[] score = {100, 88, 100, 100, 90};
        int sum = 0;
        for(int i=0; i<score.length; i++) {
            sum += score[i];
        }
        double average = (double)sum / score.length;
        System.out.printf("총점: %d, 평균: %.2f", sum, average);
    }
}
