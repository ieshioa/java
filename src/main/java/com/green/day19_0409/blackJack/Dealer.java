package com.green.day19_0409.blackJack;

import java.util.List;

public class Dealer extends Gamer {
    // 딜러가 가진 카드 수가 16 이하면 한장 더 가져가야함
    private static final int CAN_RECEIVE_POINT = 16;
    public boolean isMoreReceiveCard() {
        int sum = 0;

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            sum += card.getPoint();
        }
        return !(sum > CAN_RECEIVE_POINT);
    }
    public void moreCard() {
        super.receiveCard(new Card("Club", "3"));
    }
    public void showCard() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }
    }
}

class DealerTest {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.receiveCard(new Card("Heart", "2"));
        dealer.receiveCard(new Card("Spade", "A"));
        boolean answer = dealer.isMoreReceiveCard();  // 16 이하면 카드 한장 더 가져오기
        if(answer) {
            dealer.moreCard();
        }
        System.out.println(answer);
        dealer.showCard();
    }
}