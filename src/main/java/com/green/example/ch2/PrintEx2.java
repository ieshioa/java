package com.green.example.ch2;

public class PrintEx2 {
    public static void main(String[] args) {
        String url = "www.green.com";
        float f1 = .10f; // = 0.10, 1.0e-1
        float f2 = 1e1f; // = 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g\n", f1, f1, f1);   // %g = 값을 간략하게 표현
        System.out.printf("f2=%f, %e, %g\n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g\n", f3, f3, f3);
        System.out.println();                    // 개행

        System.out.printf("d=%f\n", d);
        System.out.printf("d=%14.10f\n", d);    // 전체 14자리 중 소수점 10자리

        System.out.printf("d=[%.2f]\n", d);     //소수점 2자리 > 반올림 처리 됨
        System.out.printf("d=[%10.2f]\n", d);   // 전체 10자리 중 소수점 2자리
        System.out.printf("d=[%010.2f]\n", d);  // 빈 공간에 0 채움
        System.out.println();

        System.out.printf("url=%s\n", url);
        System.out.printf("[12345678901234567890]\n");

        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);     // 우측정렬
        System.out.printf("[%-20s]\n", url);    // 좌측정렬
        System.out.printf("[%.8s]\n", url);     // 왼쪽에서 8글자만 출력

    }


}
