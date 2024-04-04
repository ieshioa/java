package com.green.day16_0404.ch7;

public interface PlayingCard {  // 인터페이스 이름은 형용사를 주로 씀
                                //~ble

    //public static final > 이게 자동으로 붙음
    int CLOVER = 1;
    // 인터페이스에서 멤버필드는 잘 안쓰는 편
    // 메소드는 추상메소드만 만들 수 있음

    // public abstract  > 자동으로 붙음
    String getCardNumber();

}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

// extends 얘는 무조건 클래스 상속받을 떄만
// 인터페이스 상속받을 떄는 implements

class PlayCard implements DeepPlayingCard {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();  // 카드 카인드는 자식클래스에 있어서 호출 못함
        // 카드카인드 호출하려면 형변환해야함
        DeepPlayingCard dpc = (DeepPlayingCard) pc;
        dpc.getCardKind();
        System.out.println("----");
    }
}