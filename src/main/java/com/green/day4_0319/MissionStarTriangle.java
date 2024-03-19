package com.green.day4_0319;

public class MissionStarTriangle {
    public static void main(String[] args){
        // int star = 3~7 랜덤값
        int star = (int)(Math.random() * 5) + 3;
        System.out.println(star);

/*
        <조건>
        star = 3이면
        *
        **
        ***
        star 5면
        *
        **
        ***
        ****
        *****
 */


        for (int i=0; i<star; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=star; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
