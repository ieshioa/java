package com.green.day18_0408;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args) {
        Exam2.printGugudan(2,5);

        int sum = Exam2.getSumFromString("123456789"); // 다 더한값
        System.out.println(sum);
        sum = Exam2.getSumFromString("111"); // 다 더한값
        System.out.println(sum);
        System.out.println("----");
        int[] arr = new int[9];
        System.out.println(Arrays.toString(arr));
        Exam2.inputRandomValue(arr);  // 1~9 사이의 랜덤값 중복없이
        System.out.println(Arrays.toString(arr));
    }
}
class Exam2 {
    static void inputRandomValue (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rVal = (int)(Math.random() * 9) + 1;
            arr[i] = rVal;
            for (int j = 0; j < i; j++) {
                if (arr[j] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
    static void inputRandomValue2 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                while (arr[i] == arr[j]) {
                    arr[i] = (int)(Math.random() * 9) + 1;
                    j = 0;
                }
            }
        }
    }
    static void printGugudan(int startDan, int endDan) {
        for (int i = 1; i <= 9; i++) {
            for (int j = startDan; j <= endDan; j++) {
                System.out.printf("%d X %d = %d\t", j, i, j*i);
            }
            System.out.println();
        }
    }
    static int getSumFromString(String str) {
        int num = Integer.parseInt(str);
        int sum = 0;
        int n = num;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
