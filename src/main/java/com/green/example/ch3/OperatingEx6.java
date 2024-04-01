package com.green.example.ch3;

public class OperatingEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte c = a + b;             // 이거 안됨
        //  byte c = (byte)(a + b);     // 이렇게 아니면
        int c = a + b;                  // 이렇게 해야지 실행됨
        System.out.println(c);
        // byte + byte = int

        int d = 1_000_000;  // _ 없는거나 마찬가지. 그냥 보기 편하라고 넣는거임
        System.out.println(d);

        long e = 1_000_000 * 1_000_000;  // 오버플로우 발생  int * int = int , 인트가 감당을 못해서 오버플로우
        long f = 1_000_000 * 1_000_000L;  // L 붙여주면 롱타입이 됨. 형변환되어서 long * long이 됨

        System.out.println("e: " + e);  // int의 결과가 long타입으로 바뀜, 오버플로우
        System.out.println("f: " + f);   // long * long = long > 오버플로우 발생 x

        double g = 10 / 3;  // 인트랑 인트를 나눠서 인트값이 나옴. 그 값을 더블로 형변환 하여 g에 들어감
        System.out.println("g: " + g);
        g = 10 / (double)3;  // 둘중 하나라도 더블로 바꾸면 형변환 이후 계산이 되기 때문에 더블형태로 g에 저장됨
        System.out.println("g: " + g);
    }
}