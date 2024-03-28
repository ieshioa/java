package com.green.day11_0328.ch6;

public class TvTest {
    public static void main(String[] args) {
        // 퍼블릭이 붙으면 누구나 사용할 수 있다. 공용
        // 떼버리면 같은 클래스 안에서만 사용할 수 있다.
        // 여기서는 ch6에서만 가능
        Tv tv = new Tv();
        tv.color = "red";
        tv.channel = 10;
        tv.power = true;

        System.out.printf("컬러: %s\n채널: %d\n파워: %b\n", tv.color, tv.channel,tv.power);

        Tv tv2 = new Tv();

        tv2.channelUp();

        System.out.println("tv == tv2: " + (tv == tv2));
        System.out.printf("tv2 color: %s\nchannel: %d\npower: %b",tv.color, tv.channel,tv.power );

    }
}
