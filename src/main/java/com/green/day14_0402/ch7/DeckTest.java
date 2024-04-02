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
        deck.printAllCard();
    }
}

class Deck {
    final int CARD_NUM = 52;  // 52장의 카드 객체 주소값을 담을 수 있는 공간
    Card[] cards = new Card[CARD_NUM];
    int idx = 0;
  //  int id[] = new int[CARD_NUM];

//    void shuffle() {
//        for (int i = 0; i < CARD_NUM; i++) {
//            id[i] = i;
//        }
//
//        for (int i = 0; i < id.length; i++) {
//            int random = (int)(Math.random() * id.length);
//            int tmp = id[random];
//            id[random] = id[i];
//            id[i] = tmp;
//        }
//    }

    void card () {
        String[] shapes = {"Heart", "Diamond", "Clova", "Spade"};
        for (int i = 0; i < shapes.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Card c = new Card();
                c.kind = shapes[i];
                c.number = switch (j) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(j);
                };

                cards[idx++] = c;
             //   cards[id[idx++]] = c;
            }
        }
    }

    void printAllCard () {
  //      shuffle();
        card();
        for (Card c : cards) {
            System.out.println(c);
        }
    }
}


class Card {
    String kind;    // 무늬
    String number;  // A~K

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }

}
