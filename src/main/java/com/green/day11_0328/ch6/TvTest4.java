package com.green.day11_0328.ch6;

public class TvTest4 {
    public static void main(String[] args) {
        /*
        tv 객체 주소값을 3개 저장할 수 있는 배열
         */
        Tv[] tvArr = new Tv[3];

        /*
        각 방에 tv 객체의 주소값을 넣어준다.
        모두 동일하지 않다.
         */
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
        }
        for(Tv tv: tvArr) {
            System.out.println(tv);
        }

        /*
        0번방 tv는 채널 11, 1번 12, 2번 13
         */
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channel=11 + i;
            System.out.println(tvArr[i].channel);
        }
//        int channel = 11;  // 위 문장을 for each로 바꿈
//        for (Tv tv : tvArr) {
//            tv.channel = channel++;
//        }

    }
}
