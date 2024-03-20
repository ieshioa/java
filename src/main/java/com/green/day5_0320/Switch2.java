package com.green.day5_0320;

import java.util.Scanner;
import java.util.Scanner;
public class Switch2 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요. >> ");
        String gender = scan.nextLine();

        String result = null;   // primitive 타입은 null 불가능

        switch(gender) {
            case "여":
            case "여자":
                result = "당신은 여성입니다.";
                break;
            case "남":
            case "남자":
                result = "당신은 남성입니다.";
                break;
            default:
                result = "성별을 입력해주세요";
        }
        System.out.println(result);


    }
}
