package com.green.day9_0326.ch5;

import java.util.Arrays;

public class ArryStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        // 쓰기 읽기 분리
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i+1;
        }

        for (int i = 0; i <numArr.length; i++) {
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }

        System.out.println(Arrays.toString(numArr));
    }
}
