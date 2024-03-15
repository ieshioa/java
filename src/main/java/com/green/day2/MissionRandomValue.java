package com.green.day2;

public class MissionRandomValue {
    public static void main(String[] args) {
        //1~9 사이의 랜덤한 값 나올 수 있게 세팅

        int num = (int)(Math.random() * 9);  // 0~8
        System.out.println(num + 1);
        System.out.println("-----------------");

        // 5~12 랜덤값
        for(int i=0; i<15; i++) {
            num = (int)(Math.random() * 8) + 5;


            System.out.println(num);
        }

    }
}
