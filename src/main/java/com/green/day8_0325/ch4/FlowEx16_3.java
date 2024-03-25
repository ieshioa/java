package com.green.day8_0325.ch4;

public class FlowEx16_3 {
    public static void main(String[] args) {
        /*
                <조건>
                가로10개
                세로 5개
                별 출력
         */
        int a = 10, b = 5;

        for(int i = 0; i<b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
