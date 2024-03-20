package com.green.day5_0320.ch1;
//실행 > Hello.java > 컴파일 > Hello.class > java.exe 실행 > 콘솔에 "Hello, World!" 출력
// 컴파일: 컴퓨터가 이해하는 언어로 변경 (해석)
public class Hello {  // public을 붙이면 클래스명이 무조건 파일명과 같아야한다. (파일명이랑 같아도 public 제외는 가능)
    // public : 완전 오픈, 누구나 접근
    public static void main(String[] args) {
        System.out.println("Hello, world!");

    }
}
