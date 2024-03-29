package com.green.day12_0329.ch6;

public class Card {
    String kind;    // 무늬
    int number;     // 숫자

    static int width = 100;     //가로
    static int height = 250;    // 세로

    /*
    private이 붙으면 내부에서만 쓸 수 있음 밖에서 접근 못함
    default (아무것도 안붙은것) 클래스 내부/ 같은 패키지 안에서 사용 가능 (상위 하위 패키지는 다른 패키지로 봄)
    protected 클래스안에서도 되고 같은패키지에서도 되고 상속관계인 패키지도 가능
    public 공용 모든 패키지에서 사용 가능 , 파일명과 같은 클래스만 붙일 수 있음

    나중에 멤버필드는 private 무조건 붙임

     */
}
