package com.green.day15_0403.ch7;

public class ConstructorTest {
    public static void main(String[] args) {

    }
}

class Animal {
    int age;
    public Animal() {
        super();
    }
    public Animal(int age) {
        super();
        this.age = age;
    }
}

class Tiger extends Animal {
    String name;
    Tiger(int age) {
        super(); // 생성자에 파라미터가 있어도 슈퍼는 기본만 자동으로 생성됨

    }
    Tiger(int age, String name) { // 하나는 부모 주고 하나는 나 가짐
        super();    // 부모의 (기본)생성자 호출 Animal()
        this.name = name;
    }
}
