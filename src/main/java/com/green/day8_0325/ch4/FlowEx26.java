package com.green.day8_0325.ch4;

public class FlowEx26 {
    public static void main(String[] args){
        /*
                <조건>
                1부터 계속 더함 1000까지
                더한값이 100 미만인 인덱스가 몇인지.
         */
        int sum = 0, i =0;
        while(sum < 100){
            sum += ++i;
        }
        System.out.println(--i);
    }
}
