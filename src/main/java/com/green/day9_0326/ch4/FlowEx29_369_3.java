package com.green.day9_0326.ch4;

public class FlowEx29_369_3 {
    public static void main(String[] args) {
        // 쌤
        for (int i =1; i <= 1000; i++) {
            System.out.printf("i = %d ", i);
            int copy = i;

            do {
                int oneDigit = copy % 10;
                if (oneDigit != 0 && oneDigit % 3 == 0) {
                    System.out.print("짝");
                }
//                switch (oneDigit) {
//                    case 3: case 6: case 9:
//                        System.out.print("짝");
//                }
            } while ((copy /= 10) > 2);
            System.out.println();
        }
    }
}
