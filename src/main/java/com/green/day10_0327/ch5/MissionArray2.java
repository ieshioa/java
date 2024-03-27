package com.green.day10_0327.ch5;

import java.util.Arrays;

public class MissionArray2 {
    public static void main(String[] args) {
        /*
            정수값 10개 저장할 수 있는 배열 생성
            10칸초기화 화는데 10~30 랜덤 세팅
            중복 허용
         */
        int[] arr = new int[10];

        for (int i=0; i< arr.length;i++){
            arr[i] = (int)(Math.random() * 21) + 10;
        }
        System.out.println(Arrays.toString(arr));

 //-------------------------------------------
//        int[] numArr = new int[10];
//
//        for (int i = 0; i < numArr.length; i++) {
//            int num;
//            boolean isDuplicate;
//            do {
//                isDuplicate = false;
//                num = (int)(Math.random() * 21) + 10;
//                for (int j = 0; j < i; j++) {
//                    if (num == numArr[j]) {
//                        isDuplicate = true;
//                        break;
//                    }
//                }
//            } while (isDuplicate);
//            numArr[i] = num;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(numArr[i]);
//        }
        //----------------------------------



//
//        let arr = [];
//        let i = 0
//        while(i==10){
//            let a = Math.random() *30 +10
//            let check = 0
//            for(let j=0; j< arr.length; j++){
//                if(arr[j]==a){
//                    check ++
//                }
//            }
//            if (check == 0){
//                arr[i] = a
//                i++
//            }


    }
}