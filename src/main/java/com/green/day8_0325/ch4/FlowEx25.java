package com.green.day8_0325.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        /*
                <조건>
                가이드: 숫자를 입력하세요 예) 12345 >>
                숫자를 정수로 받기
                다 더한다
                ex) 1+2+3+4+5
                각 자리 수의 합: 15

                12345 % 10 > 5
                12345 / 10 > 1234
                1234 % 10 > 4
                1234 / 10 > 123
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >> ");
        int num = scan.nextInt();
        int sum = 0;
        while (num != 0) {
            int val = num % 10;     // 맨 끝 자리 구하기
            sum += val;         // 맨 끝 자리 더하기
            num /= 10;          // 맨 끝 자리 날리기
        }
        System.out.printf("각 자리 수의 합: %d", sum);
    }
}
