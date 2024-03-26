package com.green.day9_0326.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        /*
        1부터 n까지 더하다가 100이 막 넘은 인덱스 값과 sum 출력
        while문으로 해결
         */

        int i = 0;
        int sum = 0;
        while (sum < 100) {
            sum += ++i;
        }
        System.out.printf("i = %d, sum = %d", i, sum);
    }
}
