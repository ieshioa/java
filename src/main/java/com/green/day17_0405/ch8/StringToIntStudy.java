package com.green.day17_0405.ch8;

public class StringToIntStudy {
    public static void main(String[] args) {
        int result = Utils.convertStringToInt("12d3");

        System.out.println("result: "+ result);
    }
}
class Utils {
    static int convertStringToInt(String str){
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
//            int l = str.length();
//            for (int i = 0; i < l; i++) {
//                char ch = str.charAt(i);
//
//            }

            return 0;
        }
    }
}


// Character.getNumericValue();