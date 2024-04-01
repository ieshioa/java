package com.green.day13_0401.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
    /*
        오버로딩은 매개변수로 구분만 되면 작성 가능
        오로지 매개변수만 따짐
        리턴타입은 상관없음
        오버로딩: 같은 이름의 메소드를 여러개 작성
     */
    }
}

class MyMath3 {
    int add(int n1, int n2) {
        return n1 +n2;
    }
//    void add(int n1, int n2) {    // 이거 안돼 파라미터 구분이 안되기 떄문에
//
//    }
    int add(int n1, double n2) {
        return 0;
    }
    int add(int n1, float n2) {
        return 0;
    }

}