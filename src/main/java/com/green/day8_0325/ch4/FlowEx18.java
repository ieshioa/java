package com.green.day8_0325.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        /*
                <조건>
                2 ~ 9 구구단 출력
                2단부터 9단까지 전체 출력
                단 사이 ---- 로 나누기
         */

        for (int i = 2; i <= 9; i++) {
            if(i>2){
                System.out.println("------");
            }
            for (int j = 1; j <= 9; j++){
                System.out.printf("%s * %s = %s\n", i, j, i*j);
            }
//            if (i == 9){
//                break;
//            }
//            System.out.println("-----------");
        }
    }
}
