package com.green.day6_0321.ch3;

public class OperatorEx22 {
    public static void main(String[] args) {
        //110

        float f = 0.1f;  // 이미 망가짐
        double d = 0.1;  // 비교적 정상
        double d2 = f;

        System.out.printf("%f == %f %b\n ", f, d, f==d);
        System.out.printf("%f == %f %b\n ", 10.0, 10.0f, 10.0==10.0f);
        System.out.printf("%f == %f %b\n", f, d, (double)f == d);
        System.out.printf("%f == %f %b\n", f, d, f == (float)d);  // true, 정상이 되는것보다 망가지는게 더 쉬움

    }
}
