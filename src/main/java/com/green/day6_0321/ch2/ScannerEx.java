package com.green.day6_0321.ch2;

import java.util.Scanner;

public class ScannerEx {  //41
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요. >> ");
        String input = scan.nextLine(); //"123" > 123
        // int num = (int)input;  // 안됨
        int num = Integer.parseInt(input);  // java String to int
                                            // 문자가 섞여있으면 에러가남
        System.out.println("num: " + num);
        System.out.println("num + 1: " + (num + 1));

    }
}
