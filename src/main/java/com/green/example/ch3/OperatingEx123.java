package com.green.example.ch3;

public class OperatingEx123 {
    public static void main(String[] args) {
        int n1 = 3, n2 = 5;

        //int r1 = -n1-n2;      // 가독성 안좋음
        int r1 = (-n1) - n2;  // 가독성 좋게
        System.out.println("r1: " + r1);

        int r2 = n1 + n2 * n1 / n2;   // 연산 우선순위 : 곱/나 >> 덧/뺄
        System.out.println("r2: " + r2);
        System.out.println("--------------------------");

        // 증감연산자

        int i = 5, z = 0;
        i++;
        System.out.println("i: " + i);

        i=5;
        ++i;
        System.out.println("i: " + i);

        i = 5;
        z = i++;  // i를 먼저 읽어와서 z에 복사하고 i를 증가시킴
        // 1) z=i;  2) i++;
        System.out.printf("i: %d, z: %d\n", i, z);

        i=5;
        z=0;
        z=++i;  // i를 먼저 증가시킨 후에 읽어와서 z에 복사함
        // 1) i++;  2) z=i;
        System.out.printf("i: %d, z: %d\n", i, z);

        System.out.println("-----------------------");

        int k=10;
        System.out.println(k++);  // k=11 10
        System.out.println(++k);  // k=12 12
        System.out.println(++k);  // k=13 13
        System.out.println(k++);  // k=14 13
        System.out.println(k);    // k=14
    }
}
