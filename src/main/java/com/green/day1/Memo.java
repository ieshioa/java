package com.green.day1;

public class Memo {
    public static void main(String[] args){
        System.out.print("Hello!\n");
    }

}

/*

"" : 문자열, String
void : 리턴타입
main : 메소드명
() : 매개변수
int : 데이터타입
%: mod
new: 객체화(실체화) 시킨다

[객체와 클래스]
객체 아파트
클래스 설계도
클래스를 가지고 객체를 만든다

[객체 구성요소]
속성(명사), 메소드(동사)
System.out.println;  out:속성 println:메소드

[단축키]
ctrl + / : 여러줄 한번에 주석
ctrl+d : 줄복사
sout : System.out.println();
psvm : public static void main(String[] args) {}

[변수]
static : 객체와 상관 없음
변수명 : 숫자로 시작하면 안됨
        _ $ 가능
        예약어 안됨 (파란글씨)
전역변수: 초기화 안해도 됨, 디폴트값이 있음
지역변수: 무조건 초기화 필수

[데이터타입]
(Primitive Type)
정수형: int(4B), long(8B), byte(1B), short(2B)
실수형: double, float
불린형: boolean (true, false 값만 가질 수 있는 데이터타입)
문자형: char
(Referance Type 무한대, 대문자 ex) String)

[형변환]
타입이 안맞으면 맞게 타입 변화를 줘야한다.
자동형변환, 강제형변환

[랜덤변수]
Math.random()  // 0.00000 ~ 0.9999, 리턴값 더블
Math.random() * 10  // 0 ~ 9
Math.random() * 11  // 0 ~ 10
int num = (int)(Math.random() * 10) + 1;   // 1 ~ 10

[삼항식]
조건식
식 ? true일 때 : false일 때;

[문자열 비교]
자바에서 문자열 비교는 equals로 해야한다.
== 안됨
System.out.println(s1 == so2);         // XX
System.out.println(s1.equals(so2));   // OO

[프린트 지시자]
%b      불린 형식
%d      10진 정수 형식
%o      8진 정수 형식
%x %X   16진 정수 형식
%f      부동 소수점 형식
%e %E   지수 표현식
%c      문자
%s      문자열

[scan]
import java.util.Scanner;  // Scanner 클래스를 사용하기 위해 추가함
                            // (패키지안, 클래스밖)
 Scanner scan = new Scanner(System.in);  // Scanner 객체를 생성
        // new: 객체화(실체화) 시킨다
 String input = scan.nextLine();  // 입력받은 내용을 input에 저장
 int num = Integer.parseInt(input); // 입력받은 내용을 int로 변환
 int num = scan.nextInt();  // 정수를 입력받아 저장




 */
