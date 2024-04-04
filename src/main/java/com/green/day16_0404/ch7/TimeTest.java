package com.green.day16_0404.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(2,4,5);
        //  t.hour = 10; 안됨

        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());

        t.setHour(22);
        System.out.println(t.getHour());

    }
}

class Time {    // 캡슐화, 은닉함
    // 프라이빗은 클래스 안에서만 사용함.
    private int hour;
    private int minute;
    private int second;
    // 상수는 은닉화하지 않아도 된다. 어차피 값을 변경하지 못하기 때문에
    // 그치만 인스턴스 멤버필드는 무조건 은닉화


    // 은닉화된 변수에 값 넣는법
    // 1. 생성자 (얘는 넣는거만 되고 뺼 수 없음)
    Time(int hour, int minute, int second) {    // 리턴 보이드
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 2. 메소드를 통해서 넣기   세터
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }


    // 메소드로 멤버필드 값 불러오기 게터
    public int getHour() {                  // 파라미터 없음
                                            // 리턴타입은 멤버변수랑 맞춤
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
}
