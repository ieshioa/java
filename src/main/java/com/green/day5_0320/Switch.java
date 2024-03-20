package com.green.day5_0320;

public class Switch {
    public static void main (String[] args) {
        // cascade한 부분이 있다. (폭포, 위에서부터 내려온다)
        // break 문장을 만날 때까지 전부 실행

        int mon = (int)(Math.random() * 12) + 1;  // 1~12 랜덤

        System.out.print(mon + "월 ");

        switch(mon) {
            case 11:
            case 12:
            case 1:
                System.out.println("겨울");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("봄");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("여름");
                break;
            default:
                System.out.println("가을");
                break;
        }

        //  디폴트는 꼭 뒤에 있지 않아도 된다.
        // 중간에 껴도 된다.
        switch(mon) {
            case 11:
            case 12:
            case 1:
                System.out.println("겨울");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("봄");
                break;
            default:  // 여기에 있어도 됨
                System.out.println("가을");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("여름");
                break;
        }

    }
}
