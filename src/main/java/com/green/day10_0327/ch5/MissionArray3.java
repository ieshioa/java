package com.green.day10_0327.ch5;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30};
        /*
        스와핑, 0번칸, 2번칸 스와핑해주세요.
         */
        int n = 0;
        n = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = n;
        System.out.println(Arrays.toString(numArr));

    }
}
