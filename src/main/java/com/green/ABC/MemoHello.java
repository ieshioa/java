package com.green.ABC;

public class MemoHello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

/*

[자바 실행 순서]
    RUN > Hello.java > 컴파일 > Hello.class > java.exe 실행 > 콘솔에 "Hello, World!" 출력
    컴파일: 컴퓨터가 이해하는 언어로 변경(해석)

[public]
    완전 오픈, 누구나 접근
    public을 붙이면 클래스명이 무조건 파일명과 같아야한다.
    클래스명이 파일명이랑 같을 때 public 제외는 가능

[메인 메소드]
    없으면 실행을 못함
    시작부분

[  ]
    %: mod
    new: 객체화(실체화) 시킨다
    crud(Creat Read Update Delete)

[단축키]
    ctrl + / : 여러줄 한번에 주석
    ctrl + d : 줄복사
    alt + shift + : 줄 이동
    sout : System.out.println();
    psvm : public static void main(String[] args) {}

[메소드의 구성요소]
    void : 리턴타입
    main : 메소드명
    () : 매개변수, 파라미터

[객체와 클래스]
    객체 : 아파트
    클래스 : 설계도
    클래스를 가지고 객체를 만든다

[객체 구성요소]
    속성(명사), 메소드(동사)
    System.out.println();  out:속성 println:메소드

 */