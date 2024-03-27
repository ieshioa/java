package com.green.day10_0327.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        //10, 11, 12 ~~ , 19
        for (int i=0; i< numArr.length; i++) {
            numArr[i] = i + 10;
        }
        System.out.println(Arrays.toString(numArr));
    }
}