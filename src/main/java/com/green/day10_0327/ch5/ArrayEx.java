package com.green.day10_0327.ch5;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int n = (int)(Math.random() * arr.length);
            int arrNum = arr[n];
            arr[n] = arr[i];
            arr[i] = arrNum;
//            System.out.printf("i: %d, n: %d\n", i, n);
//            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
}
