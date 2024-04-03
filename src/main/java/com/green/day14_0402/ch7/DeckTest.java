package com.green.day14_0402.ch7;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args) {
//        Card c = new Card();
//        c.kind = "Spade";
//        c.number = "A";
//
//        System.out.printf("kind: %s, number: %s\n", c.kind, c.number);
//        System.out.println(c);

        Deck deck = new Deck();
        deck.card();
        deck.printAllCard();
        Card c = deck.pick();
        System.out.println("-------");
        System.out.println(c);
        System.out.println("----");

        Card c2 = deck.pick(5);
        System.out.println(c2);
        System.out.println("-----");
        deck.shuffle();
        deck.printAllCard();

    }
}

class Deck {
    final int CARD_NUM = 52;  // 52장의 카드 객체 주소값을 담을 수 있는 공간
    Card[] cards = new Card[CARD_NUM];
    int idx = 0;

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int random = (int)(Math.random() * cards.length);
            Card tmp = cards[random];
            cards[random] = cards[i];
            cards[i] = tmp;
        }
    }

    void card () {
        String[] shapes = {"Spade", "Heart", "Clova", "Diamond"};
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String n = switch (j){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);
                };
                Card c = new Card(shapes[i], n);
                cards[idx++] = c;
            }
        }
    }

    void printAllCard () {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    Card pick(){
        int rIdx = (int)(Math.random() * CARD_NUM);
        Card tmp = cards[rIdx];
        cards[rIdx] = null;
        return tmp;
    }

    Card pick(int i){
        Card tmp = cards[i];
        cards[i] = null;
        return tmp;
    }
}


class Card {
    String kind;    // 무늬
    String number;  // A~K

    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }

}
