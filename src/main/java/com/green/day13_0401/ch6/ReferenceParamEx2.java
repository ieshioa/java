package com.green.day13_0401.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] intArr = {10, 20};
        System.out.printf("intArr[0] : %d, intArr[1]: %d\n", intArr[0], intArr[1]);

        change(intArr);
        System.out.printf("intArr[0] : %d, intArr[1]: %d\n", intArr[0], intArr[1]); // 11 21

    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
}
