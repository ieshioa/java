package com.green.day4_0319;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args) {

        // 입력한 숫자 전부 다 더하기

        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0;

        while(true) {
            System.out.print("숫자를 입력해주세요. (종료: 0) >> ");
            input = scan.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println(sum);
    }
}
