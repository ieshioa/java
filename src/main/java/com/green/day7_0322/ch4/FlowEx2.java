package com.green.day7_0322.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        /*
                <조건>
                Scanner 객체를 이용하여 콘솔에서 문자열값을 가져온다.
                받은 문자열을 숫자로 파싱한다.
                파싱한 숫자가 0이라면 > 압력하신 숫자는 0입니다.
                        아니라면 > 입력하신 숫자는 0이 아닙니다.
                                    입력하신 숫자는 ? 입니다
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요. >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        switch (num) {
            default:
                System.out.println("입력하신 숫자는 0이 아닙니다.");
            case 0:
                System.out.printf("입력하신 숫자는 %d 입니다.\n", num);
        }

        // String.format()  // printf와 기능은 같음
        String s = String.format("\n입력하신 숫자는 %d입니다.", num);  // 이런식으로 사용함
        System.out.println(s);
        // String.format 은 input이 목적이고 printf는 output이 목적이다.

//        if (num != 0) {
//            System.out.println("입력하신 숫자는 0이 아닙니다.");
//        }
//        System.out.printf("입력하신 숫자는 %d 입니다.", num);

    }
}
