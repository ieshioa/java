package com.green.day13_0401.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
        System.out.println(Arrays.toString(arr));

        printIntArr(arr); // [3,2,1,6,5,4]
    }

    public static void printIntArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }
}
