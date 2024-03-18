package com.green.day3_0318;

import java.util.Scanner;

public class MissionIf3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("성별을 입력해주세요. (남/여) >> ");
        String gender = scan.nextLine();

        while((!"남".equals(gender)) && (!"여".equals(gender))) {
            System.out.println("error");
            System.out.print("성별을 입력해주세요. (남/여) >> ");
            gender = scan.nextLine();
        }

        System.out.print("키를 입력해주세요. >> ");
        int height = scan.nextInt();

        //남자 175 여자 161
        // 남, 기준값175
        // 여 기준값161
        // 남/여 아니면 성별을 입력해주세요.

        int standHeight = 161;

        if ("남".equals(gender)) {
            standHeight = 175 ;
            System.out.print("남자");
        } else {
            System.out.print("여자");
        }

        if(height > standHeight) {
            System.out.println("평균보다 큽니다.");
        } else if(height < standHeight) {
            System.out.println("평균보다 작습니다.");
        } else {
            System.out.println("평균입니다.");
        }



    }
}
