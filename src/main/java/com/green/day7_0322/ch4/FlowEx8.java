package com.green.day7_0322.ch4;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class FlowEx8 {
    public static void main(String[] args) {
        /*
                <조건>
                스캐너 객체로 주민번호 입력받기
                주민번호 확인하여 여자인지 남자인지 판별, (+ 에러)
                스위치 쓰기
                1,3 > 남
                2,4 > 여
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 주민번호를 입력하세요. (123456-1234567) >> ");
        String numStr = scan.nextLine();
        char genChar = numStr.charAt(7);  // 문자열에서 읽어오기
        String gender = switch (genChar) {
            case '1', '3' -> "남자";
            case '2', '4' -> "여자";
            default -> null;
        };
        if (gender != null) {
            System.out.printf("당신의 성별은 %s입니다.", gender);
        } else {
            System.out.println("유효하지 않은 주민번호입니다.");
        }


    }
}
