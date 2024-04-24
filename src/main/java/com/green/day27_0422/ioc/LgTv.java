package com.green.day27_0422.ioc;

import com.green.day27_0422.Speaker;
import com.green.day27_0422.Tv;

public class LgTv implements Tv {
    private Speaker speaker;

    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public void sound() {
        System.out.println("Lg Tv: 소리가 난다.");
        speaker.sound();
    }
}
