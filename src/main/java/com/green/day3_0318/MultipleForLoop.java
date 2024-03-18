package com.green.day3_0318;

public class MultipleForLoop {
    // 이중 for문, 중첩 for문
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++){
                System.out.print("*");  // 25개
            }
            System.out.println();
        }
    }
}
