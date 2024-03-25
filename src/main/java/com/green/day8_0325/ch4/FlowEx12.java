package com.green.day8_0325.ch4;

public class FlowEx12 {
    public static void main(String[] args){
        /*
                <조건>
                반복문을 사용하여
                1~5 세로 출력
                가로 출력
         */

        for (int i = 1; i < 6; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (int i = 2; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("---------");
        for (int i = 1; i < 6; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (int i = 2; i < 5; i++) {
            System.out.printf("%d%8d\n",i,6-i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.printf("%d ",i);
        }



    }
}
