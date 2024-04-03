package com.green.day14_0402.ch6;
//p.294 매개변수가 있는 생성자 (오버로딩된 생성자), this
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("white", "auto", 5);   // 멤버필드(컬러 기어타입 도어)를 객체화와 동시에 초기화
        c1.color = "white";
        // c1 = Car 객체의 주소값이 들어있음
        // 여기 c1이랑 밑에 this랑 같은 주소값이 들어있음
        System.out.printf("c1.color: %s, gearType: %s, door: %s\n", c1.color, c1.gearType, c1.door);
        Car c2 = new Car("black", "manual", 3);
      //  c2.color = "black";
        // c2 가 가진 주소값과 이 car this의 주소값이 같다 (?)
        System.out.printf("c2.color: %s, gearType: %s, door: %s\n", c2.color, c2.gearType, c2.door);

        Car c3 = new Car();
        System.out.printf("c3.color: %s, gearType: %s, door: %s\n", c3.color, c3.gearType, c3.door);


        // 생성자를 이용한 인스턴스 복사 (딥카피)
        Car c4 = new Car(c2);
        System.out.printf("c4.color: %s, gearType: %s, door: %s\n", c4.color, c4.gearType, c4.door);

    }
}
// 기본생성자와 오버로딩된(파라미터가 있는) 생성자가 있다


class Car {
    // 전역변수 쓰는 이유 : 객체가 살아있는 동안 이 값을 유지하기 위해
    String color;       // 멤버변수
    String gearType;
    int door;

    public Car(String color, String gearType, int door) {   // 매개변수
        this.color = color;         // THIS 나 자신의 주소값이 들어있는 상수
        this.gearType = gearType;
        this.door = door;
        init();
    }

//    public Car() {                        // 위랑 아래랑 같음
//        this.color = "red";
//        this.gearType = "manual";
//        this.door = 5;
//    }

    // 생성자를 이용한 인스턴스 복사 (딥카피)
    Car(Car c) {
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
        // this(c.color, c.gearType, c.door);
    }

    Car() {
        this("red", "manual", 5); // 생성자호출
    }

    void init() {
    }

    void start() {  // 메소드에서는 생성자를 호출할 수 없다
                    // 메소드 안에 메소드 x
                    // 생성자도 메소드의 한종류
                    // 생성자: 생성후에는 호출 불가
                    // 메소드가 호출한 시점은 이미 생성 됨
    }
}
