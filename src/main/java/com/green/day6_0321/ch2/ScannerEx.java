package com.green.day6_0321.ch2;

import java.util.Scanner;

public class ScannerEx {  //41
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요. >> ");
        String input = scan.nextLine(); //"123" > 123
        //int num = (int)input;
        int num = Integer.parseInt(input);
        System.out.println("num: " + num);
        System.out.println("num + 1: " + (num + 1));

    }
}
