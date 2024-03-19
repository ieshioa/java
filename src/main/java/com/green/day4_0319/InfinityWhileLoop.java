package com.green.day4_0319;

import java.util.Scanner;

public class InfinityWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 1;

        while(true) {
            System.out.print("숫자를 입력해주세요. (종료: 0) >> ");
            input = scan.nextInt();
            if (input == 0) {
               break;
            }
        }
        System.out.println("--");
    }
}
