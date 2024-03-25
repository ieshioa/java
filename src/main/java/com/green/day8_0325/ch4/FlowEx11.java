package com.green.day8_0325.ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args){
        // 주민번호에서 7번째 자리 뽑아오기 업그레이드 버전

        /*
                <조건>
                스캐너 객체로 주민번호 입력받기
                주민번호 확인하여 여자인지 남자인지 판별, (+ 에러)
                스위치 쓰기
                1,3 > 남
                2,4 > 여

                +)
                1이라면 당신은 2000년 이전에 출생한 남자입니다
                3 당신은 2000년 이후에 출생한 남자입니다.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요. (######-#######) >> ");
        String id = scan.nextLine();
        char id7 = id.charAt(7);
        int idNum = Character.getNumericValue(id7);

        if (idNum < 1 || idNum > 4) {
            System.out.println("유효하지 않는 주민번호입니다.");

        }else {
            String gender = switch (idNum) {
                case 1,3 -> "남자";
                default -> "여자";
            };
            String year = switch (idNum){
                case 1,2 -> "이전에";
                default -> "이후에";
            };
            System.out.printf("당신은 2000년 %s 태어난 %s입니다.\n", year, gender);
        }

        if (id7 == '1' || id7 == '2' || id7 == '3' || id7 == '4') {
            String gender = switch (id7) {
                case '1','3' -> "남자";
                default -> "여자";
            };
            String year = switch (id7){
                case '1','2' -> "이전에";
                default -> "이후에";
            };

            System.out.printf("당신은 2000년 %s 태어난 %s입니다.", year, gender);
        } else {
            System.out.println("유효하지 않는 주민번호입니다.");
        }

    }
}
