package com.green.day4_0319;

public class MissionSumEvenForLoop {
    public static void main(String[] args) {

/*
    <조건>
    1~100까지 중
    짝수만 더한다.
*/
        int sum = 0;
        int end = 100;

        for (int i=0; i<=end; i++) {
            if((i % 2) == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


    }
}
