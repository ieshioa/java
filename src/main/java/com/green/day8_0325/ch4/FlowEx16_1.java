package com.green.day8_0325.ch4;

import java.util.Scanner;

public class FlowEx16_1 {
    public static void main(String[] args){
        /*
                <조건>
                star 값이 5라면
                ***** 별 5개 가로
                3이라면 3개 가로로 출력

                마지막 개행까지
         */

        Scanner scan = new Scanner(System.in);
        while(true){
            int star = scan.nextInt();
            if (star == 0) break;

            for(int i=0; i<star; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}