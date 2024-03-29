package com.green.day12_0329.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card.width = 110;
        System.out.println(Card.width);

        // 수동으로 메모리에 올리는 과정이 객체화

        // Card.kind = "";     // static 없어서 못불러옴
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        System.out.printf("c1.kind: %s\nc1.number: %d\n", c1.kind, c1.number);

        System.out.println(c1.width);   // 이렇게 사용은 되지만 Card.width 이렇게 써야함
        System.out.println(c1.height);  // 사용은 되나 지양
        System.out.println("---------");
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        System.out.printf("c2.kind: %s\nc2.number: %d\n", c2.kind, c2.number);
        System.out.println(Card.width);
        System.out.println(Card.height);

        System.out.println("----------");
        c1.width = 200;
        System.out.println(c1.width);
        System.out.println(c2.width);
        System.out.println(Card.width);

        // 싱글톤 - 스태틱은 아닌데 스태틱처럼 쓸 수 잇음

    }
}
