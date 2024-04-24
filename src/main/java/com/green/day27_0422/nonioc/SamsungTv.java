package com.green.day27_0422.nonioc;

import com.green.day27_0422.Speaker;
import com.green.day27_0422.Tv;

public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv() {
        //this.speaker = new HarmanSpeaker();
        this.speaker = new JblSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv: 소리가 난다.");
        speaker.sound();
    }
}
