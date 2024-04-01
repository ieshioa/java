package com.green.day13_0401.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();  // 메소드 호출, 객체화를 안했다 > static 메소드
                        // 클래스명이 붙지 않음 > 같은 클래스에 있다
        System.out.println("-----------");
        CallStackTest.firstMethod();  // 이것도 가능, 다른 클래스에선 무조건 이렇게 씀
        // static 적극적으로 이용하세요 메모리 넘쳐나요

    }
    public static void firstMethod() {
        System.out.println("call firstMethod");
        secondMethod();
        return;
    }
    public static void secondMethod() {
        System.out.println("call secondMethod");
        return;
    }
}
