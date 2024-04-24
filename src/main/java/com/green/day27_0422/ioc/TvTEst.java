package com.green.day27_0422.ioc;

import com.green.day27_0422.Tv;

public class TvTEst {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        String tvName = args[0];
        String speakerName = args[1];
        String wooferName = args[2];
//        String tvName = "apple";
//        String speakerName = "genelec";
//        String wooferName = "hanil";
        Tv tv = tvFactory.factory(tvName,speakerName,wooferName);
        tv.sound();

    }
}
/*
빈등록
@RestController  빈등록 + 역할지정
 */