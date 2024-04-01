package com.green.day12_0329.ch6;

public class Variable {
    // 스태틱은 객체와 하지 않아도 살아있고 인스턴스는 객체화 했을때 살아있음
    int iv;                 // 인스턴스 변수, 전역변수 (Global Variable)
    static int cv;          // 클래스 변수, 스태틱 변수

    void method() {
        int lv = 0;         // 지역변수 (Local Variable)
    }
/*
static 붙으면 객체화가 되든 안되든 상관이 없다 객체화 없이도 사용 가능
            독립적이다
            클래스 이름으로 접근해서 사용


안붙으면 해야한다
        사용하고싶다면 무조건 객체화 필요함


static이 붙으면 올라가라고 하지 않아도 무조건 메모리에 올라감(변수에 붙어도 그 클래스가 올라감)
그래서 바로 사용할 수 있음
객체마다 다른값을 사용하고싶다(?)  >> 그럼 인스턴스 변수를 써야함

 */
    static void staticMethod() {
        int lv = 0;
    }
}
