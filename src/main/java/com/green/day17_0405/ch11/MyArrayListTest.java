package com.green.day17_0405.ch11;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);   // 기존 arr 크기보다 한칸 더 큰 새로운 배열 만들고
                        // 그 배열 마지막 칸에 저 10을 넣는다.
                        // 새로운 배열의 주소값을 전역변수 arr에 대입한다.

        list.showLength();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        System.out.println(list);

        int size = list.size();
        System.out.println("size: " + size);

        System.out.println(list.get(3));
        System.out.println(list.get(0));
    }
}

class MyArrayList {
    // int 배열의 주소값을 담을 수 있는 arr
    private int[] arr;
    MyArrayList() {
        this.arr = new int[0];
    }
    void add(int num) {
        int arrL = arr.length;
        int[] tmp = new int[arrL+1];
        for (int i = 0; i < arrL; i++) {
            tmp[i] = arr[i];
        }
        tmp[arrL] = num;
        arr = tmp;
    }
    int size() {
        return arr.length;
    }

    int get(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0])); // ( )로 시작한다
        for (int i = 1; i < arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));  // append > 문자열합치기
        }
        sb.append("]");
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        if (arr.length == 0) {
//            return String.format("[]");
//        }
//        String s = String.format("[%d", arr[0]);
//        for (int i = 1; i < arr.length; i++) {
//            s += String.format(", %d", arr[i]);
//        }
//        return String.format("%s]", s);
//    }

    void showLength() {
        System.out.print(Arrays.toString(arr));
        System.out.println("  length: " + arr.length);
    }
}
