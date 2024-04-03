package com.green.day14_0402.ch6;

import java.util.Arrays;

public class MyArrays {
    public static void printArr (int[] arr) {
        if (arr.length == 0){
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }

    static String toString (int[] arr) {
        if (arr.length == 0){
            return "[]";
        }
        String s = String.format("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            s = s + String.format(", %d", arr[i]);
        }
        s = s + "]";
        return s;
    }
}

class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 10};
        MyArrays.printArr(arr);
        System.out.println(Arrays.toString(arr));

        String str2 = MyArrays.toString(arr);
        System.out.println("str2: "+ str2);
    }
}
