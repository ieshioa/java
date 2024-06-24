package com.green.day69_0624;

public class UserDtoTest {
    public static void main (String[] args) {
        UserDto dto = new UserDto();
        dto.setAge(20);
        dto.setName("홍길동");
        dto.setaddr("서울");

        UserChainingDto dto2 = new UserChainingDto();
        // 앞에 주소값이 있어야지 . 쓸 수 있다.
        // 주소.메소드호출
        dto2.setAge(21).setName("유관순").setaddr("대구");

        System.out.println(dto);
        System.out.println(dto2);

        // 1. dto2.setAge(21) 이 뒤에 . 을 적을 수 있는 이유는 참조변수값을 리턴하기 때문이다.
        // 2. 1번리턴주소값.setName("유관순")
        // 3. 2번리턴주소값.setaddr("대구")
        // 4. dd = 3번리턴주소값

        UserChainingDto dto3 = new UserChainingDto();
        UserChainingDto dd = dto3.setAge(21).setName("유관순").setaddr("대구");
    }
}
