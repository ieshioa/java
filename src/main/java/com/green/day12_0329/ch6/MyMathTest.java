package com.green.day12_0329.ch6;

public class MyMathTest {       // 메인메소드를 만들기 위한 클래스
    public static void main(String[] args) {
        // static이 안붙음 > 객체화부터 해야함.
        MyMath myMath = new MyMath();   // MyMath에 static이 붙어있으면 이 문장 필요없음
        myMath.add(10, 20);  // (주소값다트메소드명)
        myMath.add(100, 200);

        myMath.minus(100,50);
        myMath.minus(200,50);

        System.out.println(myMath.returnAdd(500,600));  // 감쌌는데 빨간줄이 안생긴다 > 100퍼센트 리턴메소드

        int result = myMath.returnAdd(500,600);     // = 했을때 빨간줄이 안생기면 100퍼센트 리턴메소드
    }
}

// 오버로딩 : 같은 이름의 메소드를 사용하는 기법
// 같은 개수라도 타입만 다르면 구분이 되기 때문에 오버로딩 많이 만들 수 있음
// 오버라이딩 : 오버로딩이랑 비슷함

class MyMath {      // 객체를 만들기 위한 클래스
    // 리턴메소드(비void) , void메소드
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
    int method2() {     // 파라미터가 없대 = 외부에서 주입받을 수가 없다, 자체적으로 해결을 못할때는 매개변수(혹은 전역변수) 사용
        return 10;     // void 메소드는 굳이 return을 적지 않아도 컴파일하면서 알아서 넣어줌
    }
    // 파라미터가 없는 경우는 보통 전역변수를 이용함
    // 있는경우는 보통 전역변수를 사용하지 않음
}
