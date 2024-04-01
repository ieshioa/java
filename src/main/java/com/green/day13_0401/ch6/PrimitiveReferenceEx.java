package com.green.day13_0401.ch6;

public class PrimitiveReferenceEx {
    // 매우 중요한 예제 ! p.264
    public static void main(String[] args) {
        int num = 10;
        Numbox nb = new Numbox();
        // new 하는 순간 heap 메모리에 저장
        // 최초로 0을 저장 (디폴트 = 0)
        // 이 주소값을 복사해서 stack nb에 저장
        nb.num = 10;
        // heap num = 10

        changeNum(num);     // num > n 복사해서 들어감(동등) >> 다른존재
        // 알수있는것 :
        // void, 같은클래스, 파라미터 정수값 1개, static메소드, 메소드명changeNum
        System.out.println(num);

        changeNum(nb); // 여기서 nb도 heap에서 같은 주소
        System.out.println(nb.num);
    }

    public static void changeNum(Numbox n) {
        n.num = 100;
    }

    public static void changeNum(int n) {
        n = 100;
    }
}

class Numbox{
    int num;
}