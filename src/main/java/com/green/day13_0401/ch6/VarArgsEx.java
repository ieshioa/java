package com.green.day13_0401.ch6;

//p.289 가변인자, 잘 사용하지 않음
public class VarArgsEx {
    public static void main(String[] args) {
        MtMath3_1 mm = new MtMath3_1();
        mm.sum(1,2);
        mm.sum(1,4,5,3,2,7,3,6,2,3,5,5,6,6,2);  // 컴파일러가 이거를 배열로 바꿔줌
    }
}

class MtMath3_1 {
    void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    void sum(int...arr){    // = void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
