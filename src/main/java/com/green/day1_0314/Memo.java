package com.green.day1_0314;

public class Memo {
    public static void main(String[] args){
    // 메인 메소드 - 없으면 실행을 못함

        System.out.print("Hello!\n");
    }

}

/*





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
    %f      부동 소수점 형식(실수타입)
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

[논리 연산자]
    and : 모두 true 일 때 true
    or : 하나라도 true 일 때 true
    not : toggle처리에 사용 (스위치, on/off, 좋아요)
    && : 논리연산자, false면 끝까지 연산하지 않고 끝냄
    & : 비트연산자, false가 나와도 끝까지 연산을 다 함 > cpu 잡아먹음

[삼항식]
    조건식
    식 ? true일 때 : false일 때;

[]

 */
