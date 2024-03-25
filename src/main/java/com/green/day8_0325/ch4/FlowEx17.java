package com.green.day8_0325.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        /*
                <조건>
                스캐너를 이용해서 정수를 입력 받고
                가이드 내용 "*" 출력할 라인의 수를 입력하세요
                만약 정수값이 3이라면
                *
                **
                ***
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int star = scan.nextInt();

        for (int i = 0; i < star; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
