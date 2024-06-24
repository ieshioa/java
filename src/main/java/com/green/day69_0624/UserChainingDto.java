package com.green.day69_0624;

public class UserChainingDto {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "UserChainingDto{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    private String addr;

    public int getAge() {
        return age;
    }

    public UserChainingDto setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserChainingDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getaddr() {
        return addr;
    }

    public UserChainingDto setaddr(String addr) {
        this.addr = addr;
        return this;
    }
}
