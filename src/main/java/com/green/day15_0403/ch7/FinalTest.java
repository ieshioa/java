package com.green.day15_0403.ch7;

public class FinalTest {
    public static void main(String[] args) {
        Car c = new Car(2200);
        //c.cc = 100;
        System.out.println(c.CC);
        Car c2 = new Car(3000);
        //c2.cc = 200;
        System.out.println(c2.CC);
    }
}

class Car {
    //final int cc = 10;  // 생성자를 ㅡ이용하면 Lazy처리 가능함
    final int CC;

    Car (int cc) {
        this.CC = cc;
    }

    final void start() {        // 파이널 메소드는 오버라이딩 못함
        System.out.println("시동을 건다");
    }

}

final class Suv extends Car {   // 클래스 앞에 파이널이 붙어버리면 (얼리면)
                                // 다른 클래스에서 상속을 할 수 없음
   /* void start() {

    }*/
    Suv() {
        super(4);
    }
    /*
    생성자가 없으면
    Suv() {
        super();
    }
    를 기본으로 넣어줌
    근데 부모에 기본생성자가 없으면 에러
     */
}


//class Tucson extends Suv {   파이널 붙어서 이렇게 안됨
//
//}