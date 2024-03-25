package com.green.day8_0325.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        /*
                <조건>
                1~10 더한값 과정 출력

                1부터 1까지의 합: ?
                ~
                1부터 10까지의 합: ?
         */
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.printf("1부터 %d까지\t합: %d\n", i, sum);
        }


    }
}
