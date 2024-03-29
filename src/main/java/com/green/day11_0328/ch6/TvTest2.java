package com.green.day11_0328.ch6;

public class TvTest2 {
    public static void main(String[] args) {

        Tv tv = new Tv();
        tv.channel = 10;

        Tv tv2 = tv;
        //shallow copy 얕은복사
        tv2 = new Tv();


    }

}
