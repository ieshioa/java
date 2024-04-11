package com.green.day19_0409.blackJack;

public class Card {
    private String pattern;         // 무늬
    private String denomination;    // A, 2~10, J, Q, K
    // 이뮤터블? 값을 수정할 수 없도록 하는것 (파이널)

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    public String getPattern(){
        return pattern;
    }
    public String getDenomination() {   // 퍼블릭 클래스면 디폴트 안씀 퍼블릭 붙임
        return denomination;
    }

    @Override
    public String toString(){
        return String.format("%s(%s)", pattern, denomination);
    }

    public int getPoint(){
//        int score = switch (denomination){
//            case "A" -> 1;
//            case "J", "Q", "K" -> 10;
//            default -> Integer.parseInt(denomination);
//        };
//        return score;
        return switch (denomination){
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
}

class CardTest {        // 미션을 주려고 만든 거임. 지워도 상관없음.
    public static void main(String[] args) {
        Card c = new Card("Spade", "A");

        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c);  // Spade(A)

        int score = c.getPoint();
    }
}