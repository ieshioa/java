package com.green.day14_0402.ch7;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();    // 캡션tv는 Tv를 상속받았기 때문에 Tv사용 가능
        cTv.channel = 10;
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        cTv.channelDown();
        System.out.println("cTv.channel: " + cTv.channel);

        cTv.caption = true;
        cTv.displayCaption("ddd");
        // 자식이 부모보다 더 작아질 수 없다


    }
}

class Tv {  // 부모클래스
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

class VideoTv extends Tv {


}

class CaptionTv extends Tv {    // 자식클래스
    // extends : 상속을 받아올때 씀
    // Tv를 확장한다(미국식)
    // Tv를 상속받아온다

    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }

    }
}