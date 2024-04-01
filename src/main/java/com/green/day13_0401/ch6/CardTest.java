package com.green.day13_0401.ch6;

import com.green.day12_0329.ch6.Card;

public class CardTest {
    public static void main(String[] args) {
        // 카드 객체 52개
        // 모양 클로버 하트 스페이드 다이아몬드
        // A 2 3 4~ K
        // 숫자 13개 모양 4개
        String[] shapes = {"Heart", "Diamond", "Clova", "Spade"};
        CardClass card[] = new CardClass[52];  // cardClass 객체가 들어갈 공간
        int idx = 0;
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 1; j <= 13; j++) {
                CardClass c = new CardClass();  // cardClass 객체 생성
                card[idx++] = c;    // idx = 0~51  객체를 card[]에 넣음
                c.shape = shapes[i];
                c.number = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);   // j를 String으로 바꿈
                };
                //card[idx++] = c;    // idx = 0~51  객체를 card[]에 넣음
                // 위에있나 아래있나 차이가 없음
                // 주소값을 복사해주는게 빨리하든 늦게하든 상관 없음
            }
        }
        for (CardClass c : card) {
            System.out.printf("%s(%s)\n", c.shape, c.number);
        }
    }
}
