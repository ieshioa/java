package com.green.example.ch6;

public class Static {

}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}

class CardTest {
    public static void main(String[] args) {

        System.out.println(Card.width);
        System.out.println(Card.height);
        // static 변수는 때문에 객체화 없이 (클래스.변수)로 바로 사용할 수 있다.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        System.out.printf("c1.kind: %s, c1.number: %d\n", c1.kind, c1.number);

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        System.out.printf("c2.kind: %s, c2.number: %d\n", c2.kind, c2.number);
        // static이 안붙은 변수는 데이터가 그 객체만 변함

        c1.width = 200;
        // static 변수도 (참조변수.변수)로 사용은 되지만 이 방법은 지양한다. Card.width 이렇게 써야함
        System.out.printf("c1.width: %d, c2.width: %d, Card.width: %d\n", c1.width, c2.width, Card.width);
        // static이 붙으면 데이터가 하나의 객체만 바뀌는 것이 아니고 다 바뀜

    }
}