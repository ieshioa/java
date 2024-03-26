package com.green.day9_0326.ch4;

public class FlowEx29_369_4 {
    public static void main(String[] args) {
        //하늘씨
        int i = 0;

        while (i != 100) {
            i++;
            int lastNum = i;
            System.out.print(i);

            while (lastNum != 0) {
                if (lastNum % 10 == 3 || lastNum % 10 == 6 || lastNum % 10 == 9) {
                    System.out.print("짝");
                }
                lastNum = lastNum / 10;
            }
            System.out.println();
        }
    }
}

