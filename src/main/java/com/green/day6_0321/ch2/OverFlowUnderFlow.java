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
    }
}
