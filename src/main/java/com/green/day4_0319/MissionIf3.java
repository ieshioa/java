package com.green.day4_0319;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("성별을 입력해주세요. (남/여) >> ");
        String gender = scan.nextLine();

        while((!"남".equals(gender)) && (!"여".equals(gender))) {
            System.out.println("잘못 입력했습니다.");
            System.out.print("성별을 입력해주세요. (남/여) >> ");
            gender = scan.nextLine();
        }

        System.out.print("키를 입력해주세요. >> ");
        int height = scan.nextInt();

        int standHeight = 161;

        if ("남".equals(gender)) {
            System.out.print("남자");
            standHeight = 175;
        } else {
            System.out.print("여자");
        }

        if (height > standHeight) {
            System.out.println("평균보다 큽니다.");
        } else if (height < standHeight) {
            System.out.println("평균보다 작습니다.");
        } else {
            System.out.println("평균입니다.");
        }


    }
}
