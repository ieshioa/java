package com.green.day9_0326.ch5;

public class MissionArray1 {
    public static void main(String[] args) {
        /*
               for문
               10, 20, 30, 40, 출력
         */
        int[] numArr = {10, 20, 30, 40};
        for (int i=0; i< numArr.length; i++) {
            System.out.print(numArr[i]);
            if(i != numArr.length-1 ){
                System.out.print(", ");
            }
        }
    }
}

