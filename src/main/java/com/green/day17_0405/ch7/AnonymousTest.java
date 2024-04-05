package com.green.day17_0405.ch7;

public class AnonymousTest {
    public static void main(String[] args) {
        Object obj = new Car();
        // obj.drive();
        Object obj2 = new Object() {            // 메소드가 의미는 없음 간단하게 일회성으로 쓰일때
            void drive() {
                System.out.println("자동차가 붕붕");
            }
            public String toString() {
                return "익명 클래스";
            }
        };
        System.out.println(obj);
        System.out.println(obj2);
    }
}


class Car {
    void drive() {
        System.out.println("자동차가 붕붕");
    }
    public String toString() {
        return "Car";
    }
}
