package com.green.day19_0409.blackJack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    protected List<Card> cards;     // 상속된 클래스에서 바로 사용할 수 있게 protected 씀
    public Gamer() {
        cards = new ArrayList();
    }
    public void receiveCard (Card card){
        cards.add(card);
    }
    public List<Card> openCards() {
        return cards;
    }
    public int scoreSum(){
        int sum = 0;

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            sum += card.getPoint();
        }
        return sum;
    }
}

class GamerTest {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        gamer.receiveCard(new Card("스페이드", "9"));
        gamer.receiveCard(new Card("하트", "2"));
        List<Card> cards = gamer.openCards();
    }
}
