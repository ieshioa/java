package com.green.day6_0321.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 129;
        int i2 = -129;

        byte b = 0;

        if(Byte.MAX_VALUE >= i) {
            b = (byte)i;  // -128 ~ 127
            System.out.println("b: " + b);
        }

        if(Byte.MIN_VALUE <= i2) {
            byte b2 = (byte)i2;
            System.out.println("b2: " + b2);
        }

        b=(byte)i;              // 129 > 127 +2 > -127
        System.out.println(b);  // 오버플로우
        byte b2 = 0;
        b2 = (byte)i2;          // -129 > -128 -1 > 127
        System.out.println(b2); // 언더플로우


        System.out.println("----------------");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("----------------");

        int n3 = -130;  // n3를 byte로 형변환을 할것이다
        // 형변환 할 수 있는 값인지 체크하는 if문을 작성해주세요
        System.out.print(n3 + ": ");

       if (n3 < Byte.MIN_VALUE || n3 > Byte.MAX_VALUE) {
           System.out.println("byte type으로 형변환을 할 수 없습니다.");
       } else {
           System.out.println("바이트 타입으로 형변환 가능합니다.");
       }
        System.out.print("형변환 한 값: " + (byte)n3);
    }
}
