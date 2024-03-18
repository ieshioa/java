package com.green.day3_0318;

import java.util.Scanner;
public class MissionIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // new: 객체화(실체화) 시킨다
//        System.out.print("성별을 입력해주세요. (남/여) >> ");
//        String gender = scan.nextLine();
//        System.out.println(gender);
//        System.out.println("-끝-");
//
        //지금까지 배운걸로
        // 남을 입력했을떄 당신은 남자입니다
        // 여를 입력했을때 당신은 여자입니다
        // 남/여 외에 다른게 입력되면 성별을 입력해주세요

        System.out.print("성별을 입력해주세요. (남/여) >> ");
        String gender = scan.nextLine();


        if(gender.equals("남")) {
            System.out.println("당신은 남자입니다.");
        } else if(gender.equals("여")){
            System.out.println("당신은 여자입니다.");
        } else {
            System.out.println("성별을 입력해주세요.");
        }
        // gender.equals("남") 보다 "남".equals(gender) 유리
        // 리터럴.이퀄스(변수) 가 에러가 안남



    }
}
