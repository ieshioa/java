package com.green.day8_0325.ch4;

import java.util.Scanner;

public class FlowEx17_1 {
    public static void main(String[] args) {
        // 책에업슴
        /*
                <조건>
                스캐너를 이용하여 정수 입력
                3이면
                __*
                _**
                ***

                5면
                ____*
                ___**
                __***
                _****
                *****
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >> ");
        int star = scan.nextInt();
        for (int i = 1; i <= star; i++) {

            for (int j = star; j > i; j--){
        //  for (int j = star - i; j > 0; j--){
        //  for (int j = 0; j < star - i; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");

        // 위에는 for문 3개 이용한거고 아래는 for문 2개 + if

        for (int i = star; i > 0; i--) {            //if (star==3)  -> 3 2 1
            for (int j = 1; j <= star; j++) {       // -> 1 2 3
                System.out.print(j < i ? "_" : "*");
//                if (j < i) {
//                    System.out.print("_");
//                } else {
//                    System.out.print("*");
//                }
            }
                System.out.println();
        }
    }
}
