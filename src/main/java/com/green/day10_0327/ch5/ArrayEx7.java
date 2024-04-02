package com.green.day10_0327.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
//        int[] numArr = new int[10];
//        //10, 11, 12 ~~ , 19
//        for (int i=0; i< numArr.length; i++) {
//            numArr[i] = i + 10;
//        }
//        System.out.println(Arrays.toString(numArr));

        int[] numArr = new int[10];

        // 10,11,12 ~~ 19

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 10;
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            int random = (int)(Math.random() * numArr.length);
            int result = numArr[random];
            numArr[random] = numArr[i];
            numArr[i] = result;
        }
        System.out.printf(Arrays.toString(numArr));

    }
}