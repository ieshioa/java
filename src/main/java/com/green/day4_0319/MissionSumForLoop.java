package com.green.day4_0319;

public class MissionSumForLoop {
    public static void main(String[] args) {

    //  1~10 더한 값 출력

        int sum = 0;
        int end = 10;

        for (int i=0; i<=end; i++) {
            sum += i;
        }
        System.out.println(sum); // 1~ end 까지 더한 값


    }
}
