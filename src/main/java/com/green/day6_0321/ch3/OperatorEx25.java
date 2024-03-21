package com.green.day6_0321.ch3;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {

        String str = "abcdefg";
        System.out.println(str.charAt(0));  // 스트링 배열에서 문자를 호출하는 메소드
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println();

        Scanner scan = new Scanner(System.in);
        char ch = ' ';  // 빈칸으로 둘 수 없음 '' 불가능 띄어쓰기 넣어야함

        System.out.print("문자를 하나 입력하세요 >> ");
        String input = scan.nextLine();
        ch = input.charAt(0);  // 캐릭터+at at: 위치

        if ('0' <= (ch) && ch <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("입력하신 문자는 소문자입니다.");
        } else if ('A' <= ch && ch <= 'Z') {
            System.out.println("입력하신 문자는 대문자입니다.");
        }

    }
}
