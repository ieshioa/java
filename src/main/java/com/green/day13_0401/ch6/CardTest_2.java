package com.green.day13_0401.ch6;

public class CardTest_2 {
    public static void main(String[] args) {
        // 카드 객체 52개
        // 모양 클로버 하트 스페이드 다이아몬드
        // A 2 3 4~ K
        // 숫자 13개 모양 4개

        CardClass card[] = new CardClass[52];
        String sh[] = {"H", "S", "D", "C"};
        int idx = 0;
        for (int i = 0; i < sh.length; i++) {
            for (int j = 1; j <= 13; j++) {
                CardClass c = new CardClass();
                card[idx++] = c;
                c.shape = sh[i];
                c.number = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);
                };
            }
        }
        for (int i = 0; i < card.length; i++) {

            System.out.printf("%s %s\n", card[i].shape, card[i].number);
        }
    }
}
