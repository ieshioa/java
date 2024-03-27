package com.green.day9_0326.ch5;

public class MissionArray1 {
    public static void main(String[] args) {
        /*
               for문
               10, 20, 30, 40, 출력
         */
        int[] numArr = {10, 20, 30, 40};
        int lastIndex = numArr.length - 1;

        for (int i=0; i< numArr.length; i++) {
            System.out.print(numArr[i]);
            if(i != lastIndex ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0; i< numArr.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }
            System.out.print(numArr[i]);
        }
        System.out.println();
        System.out.print(numArr[0]);
        for (int i = 1; i<numArr.length; i++) {
            System.out.printf(", %d", numArr[i]);
        }


    }
}