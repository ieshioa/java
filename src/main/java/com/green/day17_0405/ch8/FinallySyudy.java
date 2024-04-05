package com.green.day17_0405.ch8;

import com.sun.security.jgss.GSSUtil;

public class FinallySyudy {
    public static void main(String[] args) {
        method(2);
        System.out.println();
        method(1);
    }

    public static void method(int  val) {
        try {
            if (val % 2 == 0) {
                return;         // 리턴을 만났더라도 finally는 100% 실행을 함
            }
        }catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally");

        }
        System.out.println("method 종료");        // 얘는 return을 만나면 실행이 안됨
    }
}


