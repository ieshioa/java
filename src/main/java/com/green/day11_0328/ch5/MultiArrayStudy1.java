package com.green.day11_0328.ch5;

import java.util.Arrays;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[3][5];

        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 50;

        System.out.printf("score.length: %d(행)\n",score.length);
        System.out.printf("score[0].length: %d(열)\n", score[0].length);

        int[] tmp = score[0];   // score는 안됨 [0] 있어야함
        System.out.println(Arrays.toString(tmp));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d\t", score[i][j]);
            }
            System.out.println();
        }

    }
}
