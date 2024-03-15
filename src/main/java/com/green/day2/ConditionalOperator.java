package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args) {

//        String s = "짝";
//        s = "홀";
        String s;

        int num = (int)(Math.random() * 10) + 1;

        s = num % 2 == 0 ? "짝" : "홀";

        System.out.println(num + "은(는) " + s + "수입니다.");



    }
}
