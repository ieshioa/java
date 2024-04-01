package com.green.day13_0401.ch6;

public class CardTest_3 {
    public static void main(String[] args) {
        // 카드 객체 52개
        // 모양 클로버 하트 스페이드 다이아몬드
        // A 2 3 4~ K
        // 숫자 13개 모양 4개
        String sh[] = {"S", "D", "C", "H"};
        String num[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        CardClass card[][] = new CardClass[4][13];
        for (int i = 0; i < card.length; i++){
            for (int j = 0; j < card[0].length; j++) {
                 CardClass cd = new CardClass();
                 cd.shape = sh[i];
                 cd.number = num[j];
                 card[i][j] = cd;
            }
        }
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[0].length; j++) {
                System.out.printf("%s %s\n", card[i][j].shape, card[i][j].number);
            }
        }
    }

}
