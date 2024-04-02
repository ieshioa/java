package com.green.day14_0402.ch7;
// p.316 is-a, has-a 관계
/*
아반떼 - 차  > is-a관계
상속관계
is-a관계면 상속으로 해결함

차 - 스피커 > has-a 관계
포함관계

 */
public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
class Car {
    int cc;
    String company;
    Speaker speaker;    //  포함관계  자동차가 스피커를 포함하고 있다.
    void drive() {
        System.out.println("자동차가 붕붕");
    }
}

class Avante extends Car {

}

class Speaker {
    int volume;

    void paly() {
        System.out.println("음악이 흘러나온다.");
    }
}