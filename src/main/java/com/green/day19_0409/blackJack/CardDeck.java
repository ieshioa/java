package com.green.day19_0409.blackJack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"Spare", "Heart", "Diamond", "Club"};
    public static final int CARD_COUNT = 13;
    private List<Card> list;

    public CardDeck() {
        list = new ArrayList();
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int j = 1; j <= CARD_COUNT; j++) {
                String pattern = PATTERNS[i];
                String denomination = getDenomination(j);
                Card c = new Card(pattern,denomination);
                list.add(c);
            }
        }
    }
    private String getDenomination (int i) {
        return switch (i) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(i);
        };
    }
    public void showCards(){
        for(Card c : list) {
            System.out.println(c);
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
    public Card draw() {
        int random = random(list.size());
        Card c = list.remove(random);   // remove는 지우면서 리턴도 해줌
//        Card c = list.get(random);
//        list.remove(random);
        return c;
    }
    private int random(int num){
        return (int)(Math.random() * num);
    }
}

class CardDeckTest{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        // 기본 생성자에서 PATTERNS, CARD_COUNT를 활용하여
        // 52장의 카드 객체를 생성하여 list에 추가해 주세요.
        Card c = cd.draw(); // 랜덤한 카드 객체 주소값 리턴
        System.out.println(c);
        cd.showCards();

    }
}
