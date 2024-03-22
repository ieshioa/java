package com.green.day6_0321.ch3;

public class OperatorEx19 {
    public static void main(String[] args) {
        //mod
        int x = 10;
        int y = 8;

        System.out.printf("x / y = %d\nx %% y = %d\n", x/y, x%y);  // 문자열에 %를 출력하려면 두번 쓴다.

        int x2 = 7;
        System.out.printf("x2 %% y = %d\n", x2%y);

        // 나누기와 모드 작업은 리소스를 많이 잡아먹어서 안쓰는게 좋음

        System.out.println(-10 % 8);  // 뒤에오는 수의 부호는 의미가 없음 (뒤는 무조건 절댓값으로 바뀜)
        System.out.println(10 % -8);
        System.out.println(-10 % -8);
        System.out.println(10 % 8);
    }
}
