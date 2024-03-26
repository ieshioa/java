package com.green.day9_0326.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        /*
        업앤다운
        1 ~ 100 사이의 랜덤값을 만들어냄
        1~100사이의 정수를 입력하세요 >>
        맞추는 게임
        크다 > up
        작다 > down
         */

        int num = (int)(Math.random() * 100) + 1;
        System.out.println(num);
        Scanner scan = new Scanner(System.in);
        int input =0;
        while (input != num) {
            System.out.print("1 ~ 100정수를 입력하세요 >> ");
            input = scan.nextInt();
            System.out.println(input < num ? "up" : "down");
        }
        System.out.println("정답입니다.");
    }
}
