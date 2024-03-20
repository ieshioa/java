package com.green.day5_0320.ch2;

public class StringEx {
    public static void main(String[] args) {
        /*
        whffla
        tnlrhtlvdma
                +
         */

        String name = "Ja" + "va";
        System.out.println(name);               // Java
        String str = name + 8.0;
        System.out.println(str);                // Java8.0
        System.out.println(7 + "" + 7);         // 77
        System.out.println(7 + 7 + "" + 7);     // 147
        System.out.println(7 + "" + 7 + 7);     // 777
    }
}
