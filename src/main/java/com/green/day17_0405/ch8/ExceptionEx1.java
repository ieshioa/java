package com.green.day17_0405.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 20;
            //int c = 10/0;
            throw new Exception();  // 일부러 예외를 줌
        } catch (ArithmeticException e) {       // if문이랑 비슷함. 제일 먼저 만나는 것을 실행하고 finally로 감
            System.out.println("수학적 예외 발생");
        } catch (Exception e) {     // 모든 예외를 포함함
            e.printStackTrace();    // 어떤 에러가 났는지 프린트함
            System.out.println("예외발생!");
        } finally {     // 옵션임. 적어도되고 안적어도 됨. 예외가 발생이 되든 안되든 무조건 실행이 됨
            System.out.println("finally");
        }
        System.out.println("종료");
    }
}
