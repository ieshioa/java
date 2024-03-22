package com.green.day6_0321.ch2;
// p.75~74 형변환
public class CastingEx {
    public static void main(String[] args) {
        //primitive type, reference type 같은 카테고리(타입) 끼리는 형변환이 된다.
        //primitive > reference 형변환 안됨(보통 int > String, String > int) 이때는 파싱처리 (wrapper class 제외)

        int n1 = 10;
        Integer n2 = n1;  // 이건 가능

        double d1 = 10.0;
        Double d2 = d1;  // 같다고 봐도 됨. == 비교도 가능

        // 강제형변환, 자동형변환
        // 자동형변환이 되는 방향 (반대는 강제형변환) p.83
        // byte > short > int > long > float > double (> String ) (+ 연산자 일때만)
        //

        long l1 = 100000000L;
        float f1 = l1;  // 정확도를 조금 줄이고 범위를 넓힘
        System.out.println("f1: " + f1);
        long l2 = (long)f1;  // 값을 잃어서 자동으로 바뀌지 않음
        System.out.println("l2: " + l2);
    }
}
