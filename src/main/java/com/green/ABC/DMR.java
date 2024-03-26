package com.green.ABC;

public class DMR {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0 ; i <= n ; i += 2) {
            for (int j = 0 ; j < (n-i) / 2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-2; i > 0; i -= 2) {
            for(int j = 0; j < (n-i) / 2; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
