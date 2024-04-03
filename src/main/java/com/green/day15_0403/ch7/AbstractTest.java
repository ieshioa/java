package com.green.day15_0403.ch7;

public class AbstractTest {
    public static void main(String[] args) {
       // Dog d = new Dog(); 객체화 안됨
    }
}

abstract class Dog {
    // 추상클래스
    /*
    객체화도 안되는데 왜 사용하냐?
    부모로서의 역할만 함
    상속만

     */
}

abstract class Cat {  // 추상메소드를 하나라도 가지고 잇으면 필수로 클래스 앞에 abstract 써야함
    int age;
    // 추상메소드
    abstract void crying(); // 추상메소드는 오버라이딩 강제임
    void jump() {
        System.out.println("ㅈ폴짝");
    }
}

class KoreaShort extends Cat{
    @Override
    void crying() {     // 나(캣)를 상속받는 클래스는 추상메소드(크라잉)를 무조건 써야함
        System.out.println("야옹");
    }
}

class AmericaCat extends Cat {
    @Override
    void crying() {
        System.out.println("미유");
    }
}