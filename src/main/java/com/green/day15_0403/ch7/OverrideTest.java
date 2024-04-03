package com.green.day15_0403.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);
        System.out.println(p.age);
        Child child = new Child();
        child.attack();
        child.doubleAttack();
    }
}

class Parent {
    int age;  // 객체가 살아있는 한 죽지않음


    Parent() {

    }
    Parent(int n) {  // 객체생성하면서 초기화를 하고싶을떄 사용함
        super();    // 최상위에 있어야함
        this.age = n;
    }
    void attack() {
        System.out.println("부모가 적을 공격한다.");
    }
    public void defense(){
        System.out.println("부모가 적의 공격을 방어한다.");
    }

}

class Child extends Parent {
    int mzPower;
    public Child() {
        super();    // 디스랑 슈퍼 가리키는것만 다름
                    // 디스는 자기 자신을 가리킴
                    // 슈퍼는 ? (상위에 있는 기본생성자 호출)
                    // 부모한테 기본 생성자가 있어야함
                    // 만들기 싫으면 슈퍼에 n값을 넣어 (부모가 가지고있는 생성자 이용)
        // this() 는 소괄호 호출임
        // 생성자에서 생성자 호출은 되지만 메소드에서 생성자 호출은 안된다.
    }
    @Override // 애노테이션 Annotation 얘가 진짜 오버라이딩이 맞는지 체크해줌
                        // 부모중에 얘랑 똑같이 생긴 메소드가 있는지 (부모꺼를 재정의)
                        // 실수방지
    void attack() {
     //   super.attack();  // 부모에 있는 메소드 호출
        System.out.println("자식이 적을 공격한다.");
    }

    public void doubleAttack() {
        this.defense();     // 이때는 디스를 쓰나 슈퍼를 쓰나 똑같다
                        // 오버로딩이 되어있다면 디스와 슈퍼가 다르다
                        // 이 경우는 일단 나부터 디펜스가 있는지 찾아보고 없으면 부모롤 올라감
        System.out.println("---");
        this.attack();
        super.attack();
    }

}
