package com.green.day27_0422.ioc;

import com.green.day27_0422.Speaker;
import com.green.day27_0422.Woofer;

public class GenelecSpeaker implements Speaker {
    private Woofer woofer;

    public GenelecSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void sound() {
        System.out.println("GenelecSpeaker : 소리가 짱짱하다.");
        woofer.soundBase();
    }
}
