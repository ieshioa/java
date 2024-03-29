package com.green.day12_0329.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        // static이 안붙음 > 객체를 선언 (객체화)
        MyMath myMath = new MyMath();   // MyMath에 static이 붙어있으면 이 문장 필요없음
        myMath.add(10, 20);  // (주소값다트메소드명)
        myMath.add(100, 200);

        myMath.minus(100,50);
        myMath.minus(200,50);

        System.out.println(myMath.returnAdd(500,600));

        int result = myMath.returnAdd(500,600);     // = 했을때 빨간줄이 안생기면 100퍼센트 리턴메소드



    }
}

class MyMath {
    // 리턴메소드 , void메소드
    // 메소드의 구성요소 :
    // 리턴타입, 메소드명, 파라미터(매개변수)  > 메소드의 선언부
    // { }  > 메소드의 구현부
    void add(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
    }
    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }
    int returnAdd (int n1, int n2) {
        return n1+n2; // 브레이크랑 비슷 만나면 바로 박살냄
    }
    int method2() {
        return 10;
    }
    // 파라미터가 없는 경우는 보통 전역변수를 이용함
    // 있는경우는 보통 전역변수를 사용하지 않음
}
