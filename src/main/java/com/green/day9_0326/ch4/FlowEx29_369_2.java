package com.green.day9_0326.ch4;

public class FlowEx29_369_2 {
    public static void main(String[] args) {
        // 민엽씨
        int i = 0;
        while (i != 100) {
            i++;
            String lastNum = Integer.toString(i);
            int length = lastNum.length();
            System.out.print(i);
            for (int j = length - 1; j >= 0; j--) {
                if (lastNum.charAt(j) == '3' || lastNum.charAt(j) == '6' || lastNum.charAt(j) == '9') {
                    System.out.print(" 짝");
                }
            }
            System.out.println();
        }
    }
}
