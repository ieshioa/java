package com.green.day13_0401.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        Math.abs(10); // 멤버필드가 없음
        MyMath2 mm = new MyMath2();     // static 없어서 객체화
        //System.out.println(mm.add());   // static 있으니까 바로 씀
        //System.out.println(MyMath2.add(10,20));

        long r = MyMath2.add(10,20);
        System.out.println(r);

        long r2 = mm.add();
        System.out.println(r2);

        // 인스턴스 메소드는 static 메소드를 사용할 수 있음
        // (static은 누구나 이용할 수 있다 static이든 인스턴스든 )
        // 객체화가 됐든 안됐든 이미 메모리에 올라가있어서 가능
        // !! 인스턴스 메소드를 이용하려면 객체화 해야함 !!

    }
}

class MyMath2 {
    long n1, n2;    // 인스턴스 멤버필드는 static 메소드에서 쓸 수 없음

    long add() {        // 얘는  static 없으니까 쓸 수 있음
        System.out.println("call add()");
        add(10,20); // 재귀함수(내가 나를 부르는)가 아님
                    // 나를 호출하려면 파라미터가 없어야함 add(); > 무한루프에 빠짐
        return n1+n2;       // 전역변수 이용
    }

    static long add(long n1, long n2) { // 전역변수가 static이면 여기서도 쓸 수 있음
        System.out.println("call add(n1, n2)");
        return n1+n2;       // 지역변수 이용
                // 이름 같을때 무조건 제일 가까운애 사용함 > 매개변수가 훨씬 가까움
    }
}
