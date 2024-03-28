package com.green.day11_0328.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];
        int[] counterArr2 = new int[len];  // 형우씨
        /*
        numArr 방에 0~9 랜덤값 넣기 중복o
         */
        for (int i = 0; i < len; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArr));
    /*
        numArr 각 칸에 들어있는 값의 개수를 가운터배열에 정리한다
        예를들어 9 8 6 7 6 6 0 0 4 2 인 경우
        카운터배열0 = 2
        카운터배열9 = 1
     */

        for (int i = 0; i < len; i++) {
            int count = 0;
            for(int j=0; j<len; j++)
                if (numArr[j] == i){
                    count++;
                }
            counterArr[i] = count;
        }
        System.out.println(Arrays.toString(counterArr));

        for (int i = 0; i < len; i++) {     // 형우씨
            counterArr2[numArr[i]]++;
        }
        System.out.println(Arrays.toString(counterArr2));
    }
}
