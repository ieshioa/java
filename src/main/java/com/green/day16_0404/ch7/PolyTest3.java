package com.green.day16_0404.ch7;

public class PolyTest3 {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();

        Animal ani = new Animal();
        // instanceof
        // 왼쪽은 보통 변수(레퍼런스변수)
        // 오른쪽은 클래스를 적음
        // 왼쪽이 오른쪽으로 형변환이 가능하면 true, 아니면 false

        boolean r = bullDog instanceof Dog;
        System.out.println("r: " + r);

        System.out.println("ani instanceof Dog: "+ (ani instanceof Dog));

        ani = new BullDog();
        System.out.println("ani instanceof Dog: "+ (ani instanceof Dog));

    }
}
