package com.green.day19_0409;

import java.util.Arrays;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1 2 3";
        String[] strArr =  str.split(" ");  // " " (스페이스바)를 기준으로 나눔
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println("---");
        String str2 = "4,5,6";
        String[] strArr2 = str2.split(",");
        System.out.println(strArr2[0]);
        System.out.println(strArr2[1]);
        System.out.println(strArr2[2]);

        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

class Exam {

}
