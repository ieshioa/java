package com.green.day3;

public class MissionMultipleForLoop {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 5) + 2;  // 2~6 랜덤값
        System.out.println(star);

        // 만약 star 2라면 **
        //                **
        // 4라면  ****
        //        ****

        for(int i=0; i<star; i++) {
            for (int j=0; j<star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
