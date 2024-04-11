package com.green.day19_0409.blackJack;

import java.util.Scanner;

public class Game {
    public static final int INIT_RECEIVE_CARD_COUNT = 2;  // 게임 최초 받는 카드 수
    public static final int BLACKJACK = 21;
    /*
    접근제어자
    private 주는게 좋음
    범위가 넓어지면 넓어질수록 찾기가 어려움
    값이 수정이 됐을때 그것이 문제가 되는지 안되는지 찾는게 어렵다
    어디서 썼는지 찾기가 어렵기 때문에
    프라이빗을 사용하면 여기만 체크하면 되니까 더 쉬움
    테스트 양은 줄이면 줄일수록 좋다 (요즘은 TDD 있으니까 사실 그렇게 문제가 되진 않음)
     */

    public void play() {
        System.out.println("=====BlackJack=====");
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);

//        System.out.println("gamer: " + gamer.openCards());
//        System.out.println("dealer: " + dealer.openCards());
//        cardDeck.showCards();
        System.out.println(gamer.openCards());

        if(dealer.scoreSum() < BLACKJACK) {     // 딜러가 21 이상이면 카드를 뽑지 않고 바로 종료
            playingPhase(cardDeck, gamer, dealer);
        }

        System.out.println("-----------------");
        rule.whoIsWinner(gamer, dealer);
    }

    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        Scanner scan = new Scanner(System.in);

        // 게이머가 0을 입력할때까지 카드를 뽑는다. (게이머가 카드 객체 주소값 추가로 저장)
        while (gamer.scoreSum() < BLACKJACK) {      // 게이머가 21 이상이 되면 종료
            System.out.print("카드를 뽑겠습니까? (0을 누르면 종료됩니다.) >> ");
            String input = scan.nextLine();
            if ("0".equals(input))  {
                break;
            }
            Card c = cardDeck.draw();
            gamer.receiveCard(c);
            System.out.println(c);
        }

        scan.close();
    }

    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");     // 딜러랑 게이머 두장씩 가져가기
        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            gamer.receiveCard(cardDeck.draw());
            Card c = cardDeck.draw();
            dealer.receiveCard(c);
        }
        // 딜러가 16점 이하면 카드 한장 더 받기 (16이 넘을때까지)
        while (dealer.isMoreReceiveCard()){
            Card c = cardDeck.draw();
            dealer.receiveCard(c);
        }

    }
}
