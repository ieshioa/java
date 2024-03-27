package com.green.day9_0326.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50;
        int[] numArr = new int[10];         // 주소값이 저장됨 > 속성과 기능이 있다.
        numArr = new int[11];               // 11칸짜리로 새로 만들어짐. 이전에 있던 배열은 사라짐

        /*
        배열을 사용하는 이유?
            같은 타입의 여러 값을 편하게 쓰기/읽기 하기 위해서
        배열의 특징?
            만들고나서 크기 변경이 안된다.
            index로 사용한다.
            i는 0번부터 시작된다.
            마지막 인덱스 값은 배열의 크기 -1 이다.
            for문이랑 궁합이 좋다
         */

        int[] numArr2 = {10, 20, 30, 40, 50};
        int[] numArr3 = new int[] {10, 20, 30};

        // 초기화 하지 않았을 때 디폴트 (배열에서)
        // 정수 - 0
        // 불린 - false
        // primitive - null

        String[] strArr = new String[5];


        System.out.println(numArr[0]);
        numArr[0] = 11;
        System.out.println(numArr[0]);

        System.out.println(numArr2[1]);
        numArr2[1] = 25;
        System.out.println(numArr2[1]);
    }
}
