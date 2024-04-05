package com.green.day17_0405.ch11;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);   // 0번방에 값 대입
        list.add(20);   // 1번방에 값 대입
        list.add(30);   // 2번방에 값 대입
        list.add("하하하");   // 3번방에 값 대입
        list.add(5.246f);   // 4번방에 값 대입

        //ArrayList는 범용적으로 만들어졌다 > object 타입으로 넘어옴 > 쓸때는 형변환 해야함
        int r = (int)list.get(2);
        float s = (float)list.get(4);
        System.out.println(r);
        System.out.println(s);
    }
}
