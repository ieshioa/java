package com.green.day11_0328.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        /*
        0칸의 평균값 합계값
         */
        int[] sum = new int[score[0].length];

        for (int i=0; i<score.length;i++){
            for (int j = 0; j < score[0].length; j++) {
                sum[j] += score[i][j];
            }
        }
        double[] average = new double[score[0].length];
        for (int i = 0; i < score[0].length; i++) {
            average[i] = (double) sum[i] / score.length;
        }
        for (int i = 0; i < score[0].length; i++) {
            System.out.printf("합: %d, 평균: %.2f\n", sum[i], average[i]);
        }
    }
}
