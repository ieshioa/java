package com.green.day3_0318;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요. (남/여) >> ");
        String gender = scan.nextLine();
        System.out.print("당신의 키를 입력해주세요. >> ");
        int height = scan.nextInt();

        //남자 175 여자 161
        // 남, 기준값175
        // 여 기준값161
        // 남/여 아니면 성별을 입력해주세요.
        System.out.println("---------");
        if ("남".equals(gender)){
            if (height > 175) {
                System.out.println("당신은 남자 평균 키보다 큽니다.");
            } else if (height < 175) {
                System.out.println("당신은 남자 평균 키보다 작습니다.");
            } else {
                System.out.println("당신의 키는 남자 평균입니다.");
            }
        } else if ("여".equals(gender)) {
            if (height > 161) {
                System.out.println("당신은 여자 평균 키보다 큽니다.");
            } else if (height < 161) {
                System.out.println("당신은 여자 평균 키보다 작습니다.");
            } else {
                System.out.println("당신의 키는 여자 평균입니다.");
            }
        } else {
            System.out.println("성별을 입력해주세요.");
        }
        System.out.println("---------");

         // 코드 중복 줄이기

        int standHeight = 161;

        if ("남".equals(gender)) {
            standHeight = 175 ;
            System.out.print("남자");
        } else if ("여".equals(gender)) {
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
