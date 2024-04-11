package com.green.day19_0409.blackJack;

public class Rule {
    public static final int BLACKJACK = 21;
    void whoIsWinner(Gamer gamer, Dealer dealer) {
        /*
        비기는 경우
            - 점수가 같음
            - 둘 다 21점 초과

        딜러가 이긴다, 게이머가 진다
            - 딜러 21점 미만, 게이머가 21점 초과
            - (둘 다 21점 미만) 딜러가 게이머보다 점수가 높다.

        게이머가 이긴다, 딜러가 진다
            - 게이머 21점 미만, 딜러가 21점 초과
            - (둘 다 21점 미만) 게이머가 딜러보다 점수가 높다.
         */

        int gamerScore =  gamer.scoreSum();
        int dealerScore = dealer.scoreSum();

        System.out.printf("gamer\t: %s\ndealer\t: %s\n" , gamer.openCards(), dealer.openCards());
        System.out.println("-----------------");
        System.out.printf("게이머: %d점  딜러: %d점\n" , gamerScore, dealerScore);

        if ((gamerScore > BLACKJACK && dealerScore > BLACKJACK) || (gamerScore == dealerScore)){
            System.out.println("=== 비겼습니다 ===");
            return;
        }
        if (dealerScore > BLACKJACK || (gamerScore <= BLACKJACK && (gamerScore > dealerScore))) {
            System.out.println("=== 승리! ===");
            return;
        }
        System.out.println("=== 패배 ===");

    }
}
