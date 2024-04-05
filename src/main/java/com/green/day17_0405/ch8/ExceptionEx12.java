package com.green.day17_0405.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
       // div(2,0);
       // divTry(2,0);
//        try {
//            divThrows(2,0);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
  //      divThrows(10,2);
        System.out.println("--");
    }
    public static void div(int n1, int n2){
        System.out.println(n1/n2);
    }
    public static void divTry(int n1, int n2) {
        try {
            System.out.println(n1/n2);
        }catch (Exception e) {
            System.out.println("0으로 나누기 노노");
        }
    }
    public static void divThrows(int n1, int n2) throws Exception {
        System.out.println(n1/n2);
    }
}
