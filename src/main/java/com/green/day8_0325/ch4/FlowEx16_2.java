package com.green.day8_0325.ch4;

import java.util.Scanner;

public class FlowEx16_2 {
    public static void main(String[] args) {
        /*
                <조건>
                중첩for문 이용
                star값이 5라면
                *****
                *****
                *****
                *****
                *****
         */
        Scanner scan = new Scanner(System.in);
        while(true){
            int star = scan.nextInt();
            if (star == 0) break;

            for(int i=0; i<star; i++){
                for (int j = 0; j<star; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
