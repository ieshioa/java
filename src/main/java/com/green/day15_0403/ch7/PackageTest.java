package com.green.day15_0403.ch7;

import com.green.day12_0329.ch6.Card;
import com.green.day13_0401.ch6.CardClass;
import com.green.day14_0402.ch6.MyArrays;
import static com.green.day14_0402.ch6.MyArrays.printArr;
// 이렇게 하면 앞에 클래스명 안붙여도 메소드 쓸수있음 (멤버필드도 가능 그치만 쓸 일은 거의 없음)

/*
    1. 비슷한 클래스를 묶어놓으려고 (자바 파일을 관리하기 위해 분류)
    2. 똑같은 이름의 클래스를 구분하기 위해
 */
public class PackageTest {
    public static void main(String[] args) {
        Card c = new Card();  // import 를 사용해서 day12에 있는 클래스를 가져옴
        // 같은 이름의 클래스는 import 못함 (위 문장이 어떤 카드인지 구분 못해서)
        com.green.day13_0401.ch6.CardClass c2 = new com.green.day13_0401.ch6.CardClass();
        // 같은 이름의 클래스를 두개 다 쓰고싶다면 하나는 위에처럼 써야함

        int[] arr = {1,2,3};
        MyArrays.printArr(arr);
        printArr(arr);
    }
}
