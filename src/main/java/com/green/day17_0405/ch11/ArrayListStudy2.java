package com.green.day17_0405.ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer n2 = 10;
        double d1 = 10.1;
        Double d2 = 10.1;
        // 래퍼클래스: primitive 타입의 객체형  (Integer, Double)
        ArrayList<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList();      // 뒤에를 딴거로 바꾸고싶을때 부모인 list가 더 유연하기 때문에 list 쓰는게 나음
        // ArrayList<Integer> list = new ArrayList<Integer>();  // < > 적는거랑 안적는거 똑같음
                // <> 안에 primitive 타입은 안됨
        // ArrayList 안에는 객체가 들어감
        list.add(10);  // 이제 정수밖에 안들어감 (제네릭 Generic)
        list.add(20);
        list.add(30);
        list.add(40);
        // list.add("asd");
        int r1 = list.get(0); //// 형변환 안해도 됨
        System.out.println(r1);
        System.out.println(list);       // 전체 출력
        // 배열과는 다르게 크기를 늘리고 줄이고 할 수 있음.
        list.remove(0); // 0번방을 삭제하겠다
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {  // list.size()  int형 리턴메소드임 방 개수를 리턴해줌
            System.out.printf("list.get(%d) >> %d\n", i, list.get(i));
        }

    }
}
