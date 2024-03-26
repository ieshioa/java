package com.green.example.ch2;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');               // ''' 불가능
        System.out.println("abc\t123\b456");    // \b에 의해 3이 지워진다.
        System.out.println('\n');               // 개행 출력 후 개행 > 두줄 띄움
        System.out.println("\"Hello\"");
        System.out.println("c:\\");
    }
}
