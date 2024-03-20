package com.green.day5_0320;

import java.util.Scanner;

public class Switch3New {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요. >> ");
        String gender = scan.nextLine();

        // new 버전

        String result = switch(gender) {
            case "여", "여자" -> "당신은 여성입니다.";
            case "남", "남자" -> "당신은 남성입니다.";
            default -> "성별을 입력해주세요";
        };
        System.out.println(result);

    }
}
