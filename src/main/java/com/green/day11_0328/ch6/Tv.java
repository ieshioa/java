package com.green.day11_0328.ch6;

public class Tv {
    String color;
    boolean power;
    int channel;


    // 아래가 멤버메소드
    //위에는 멤버필드

    void power() {
        power = !power;     // toggle
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }


}
