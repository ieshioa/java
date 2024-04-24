package com.green.day27_0422.ioc;

import com.green.day27_0422.*;

public class TvFactory {

    // 싱글톤

    private static TvFactory tvFactory;

    public static TvFactory getInstance() { // 여기서만 객체화 한번 가능 , 한개를 돌려씀
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    private TvFactory() {    }  // 외부에서 객체화를 막았음

    public Tv factory(String TvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "boss" -> new BossSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };
        Tv tv = switch (TvName) {
            case "lg" -> new LgTv(speaker);
            case "apple" -> new AppleTv(speaker);
            default -> null;
        };
        return tv;
    }
    //뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요뭐요
}
