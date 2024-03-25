package com.green.day7_0322.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        /*
                <조건>
                스캐너 객체를 사용하여 month(월)값을 정수로 입력받는다.

                mon값이 3~5 (스위치문 이용) "현재 계절은 봄입니다."
                6~8 여름
                9~11 기을
                12~2 겨울
                이외값은 잘못입력하였습니다.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력하세요. >> ");
        int month = scan.nextInt();

        String season = switch (month) {
            case 3,4,5 -> "봄";
            case 6,7,8 -> "여름";
            case 9,10,11 -> "가을";
            case 12,1,2 -> "겨울";
            default -> null;
        };

        if (season != null){
            System.out.printf("현재의 계절은 %s입니다.\n", season);
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}