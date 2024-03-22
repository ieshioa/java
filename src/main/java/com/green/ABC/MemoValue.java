package com.green.ABC;

public class MemoValue {
    public static void main(String[] args) {

    }
}
/*

[변수]
    static : 객체와 상관 없음
    전역변수: 초기화 안해도 됨, 디폴트값이 있음
    지역변수: 무조건 초기화 필수

[스코프 (Scope)]
    > 개념은 모든 언어가 동일
    > 변수가 선언이 되면 그 변수를 감싸고 있는 중괄호가 있다.
    > 그 중괄호를 벗어나면 죽는다.
    > 전역변수는 예외

[변수 타입]
    primitive type (원시타입, 기본형)
        > 리터럴 값 저장
        > 논리형: true / false 값을 가짐
        > 문자형
        > 정수형: 소수점이 없는 숫자를 저장
        > 실수형: 소수점이 있는 숫자를 저장
    reference type (레퍼런스타입, 참조형)
        > primitive 타입을 제외하고는 모두 reference 타입 (e.g. String)
        > 객체의 주소값을 저장
        > 첫글자는 대문자로 시작한다.  why? class를 객체로 만드니까
        > == 비교는 주소값 비교, equals 비교는 값 비교

[데이터 타입]
    논리형: boolean
    문자형: char
    정수형: int(4B), long(8B), byte(1B), short(2B)
            (cpu의 처리 단위가 4Byte이기 때문에 int가 처리속도가 제일 빠르다.)
    실수형: float(4B), double(8B)
            (속도 위주로 쓰고싶으면 float, 정확도 위주로 쓰고싶으면 double을 이용한다.)

[형변환]
    타입이 안맞으면 맞게 타입 변화를 줘야한다.
    자동형변환, 강제형변환

[랜덤변수]
    Math.random()  // 0.00000 ~ 0.9999, 리턴값 더블
    Math.random() * 10  // 0 ~ 9
    Math.random() * 11  // 0 ~ 10
    (원하는 최댓값 +1만큼 곱해줌)
    int num = (int)(Math.random() * 10) + 1;   // 1 ~ 10

[상수 / 리터럴 (Literal)]
    상수
        데이터 타입 앞에 final 붙음
        한번 입력된 값이 수정이 안되는 공간
    리터럴
        값 그 자체
        현실세계에세 얘기하는 상수와 같음
    e.g.
        int x = 10;  // 리터럴 = 10
        final int MAX_SPEED = 240;  // 상수: MAX_SPEED 리터럴: 240
        MAX_SPEED = 250;  // x. 안됨. 컴파일에러발생
    why 상수?
        > pi같은 경우 값이 변경이 되면 안되기 때문에 상수를 씀
        > 변수보다 상수가 속도가 더 빠름
        > 변수에는 변할 수 있다는 기능이 있기 때문에 더 느림
        > 상수는 바뀌지 않기 때문에 기능이 없어서 더 빠름

[null]
    주소값이 없다는 뜻
    primitive 타입은 null 가질 수 없다.
    reference 타입은 객체의 주소값을 저장할 수 있다.
    객체의 주소값만 저장 가능 (그리고 이것은 객체를 가리키고 있다고 표현)

[네이밍 규칙]
    변수, 메소드
        > 대소문자 구분
        > 길이제한 X
        > 예약어 사용 X (파란글씨, 클래스명은 사용 가능하나 사용하지 않는 것이 좋다.)
        > 숫자로 시작 X (시작만 아니면 어느 위치든 상관없다.)
        > 특수기호는 _ $ 만 허용
        > 여러단어로 구성된 이름은 카멜 케이스 기법 (e.g. lastIndexOf, happySundayMorning)
    클래스
        > 첫글자는 무조건 대문자로 시작
        > 여러단어로 구성된 이름은 파스칼 케이스 기법 (e.g. LastIndexOf, StringBuffer)
    상수
        > 상수 이름은 모두 대문자
        > 단어 구분은 _ 로 한다.
        > String, primitive type 일 때 사용하는 편
        > e.g. LAST_INDEX_OF, STRING_BUFFER

[long과 float 초기화]
    변수를 선언하고 초기화 할 때 long타입은 리터럴 뒤에 l혹은 L,
    float 타입은 f 혹은 F를 붙여야 한다.
    why? long num = 9876543210;
        을 입력했다고 했을 때, 리터럴 9876543210은 num에 저장되기 전에
        임시로 int 타입으로 저장이 되는데 이때 int 범위를 초과해서 오류가 난다.
        뒤에 l 혹은 L을 붙여주면 이것을 방지할 수 있다.
        (float의 경우에는 double타입으로 임시로 저장함)

 */