package com.green.day10_0327.ch5;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {
        /*

         */
        int[] nArr1 = {10, 20, 30};
        int[] nArr2 = nArr1;    // 주소값을 복사함 = 얕은복사 - Shallow Copy

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));

        nArr2[1] = 50;      // 같은 공간에 있기때문에 둘다 바뀜
        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));
    }
}
