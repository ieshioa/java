package com.green.day9_0326.ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        /*
        가이드 출력 " 합계를 구할 숫자를 입력하세요. (종료: 0) >> "
        0이 입력 될때까지
        입력한 모든 숫자를 더한 값을 마지막에 출력한다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("합계를 구할 숫자를 입력하세요. (종료: 0) >> ");
        int input = scan.nextInt();
        int sum = 0;
        while (input != 0) {
            sum += input;
            System.out.println("합: " + sum);
            System.out.print("합계를 구할 숫자를 입력하세요. (종료: 0) >> ");
            input = scan.nextInt();
        }
        System.out.println("종료");
    }
}
