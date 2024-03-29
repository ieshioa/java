package com.green.day11_0328.ch5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};
        System.out.println(names[1]);
        String tmp = names[1];
        System.out.println(tmp);
        // 0번방 값을 " Yu"
        names[0] = "Yu";
        System.out.println(Arrays.toString(names));
        System.out.println("--------");
        //for문
        for (int i = 0; i < names.length; i++) {
            String val = names[i];
            System.out.printf("val: %s\n", val);
        }
        System.out.println("---------");
        //for each 문 (향상된 for문)
        for(String val : names) {       // 주로 읽어올때 사용함, 변경할때는 for문 사용 (배열을 변경할때를 말함)
            System.out.printf("val: %s\n", val);
        }
    }
}
