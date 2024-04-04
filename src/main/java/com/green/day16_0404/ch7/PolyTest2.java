package com.green.day16_0404.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        // 리턴타입 void, 파라미터 1개씩, static,
        // PolyTest2안에 있음, 메소드명 doCrying
        doCrying(dog);
        doCrying(bullDog);
        doCrying(cat);
    }

    static void doCrying(Animal ani) {
        ani.crying();
        if (ani instanceof Dog) {
            // ((Dog)ani).sleep();
            Dog d = (Dog)ani;
            d.sleep();
        }
        if (ani instanceof Dog d) {
            d.sleep();
        }
    }
}