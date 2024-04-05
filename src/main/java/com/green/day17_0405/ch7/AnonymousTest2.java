package com.green.day17_0405.ch7;

public class AnonymousTest2 {
    public static void main(String[] args) {
        Movable m1 = new MyMove();
        m1.move();
        // 위의 과정 (MyMove 클래스 포함) 아래 익명클래스로 한번에 끝낼 수 있음
        Movable m2 = new Movable() {
            @Override
            public void move() {
                System.out.println("일본으로 가자!");
            }
        };
        m2.move();
    }
}

interface Movable { // 메소드가 선언부만 있고 구현부는 없어서 인터페이스는 객체화가 안됨
                        // 근데 익명클래스는 가능함
    void move();
}

class MyMove implements Movable {
    @Override
    public void move() {
        System.out.println("서울까지 가자 ~");
    }
}
