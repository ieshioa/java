package com.green.day69_0624;

public class UserDto {
    private int age;
    private String name;
    private String addr;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaddr() {
        return addr;
    }

    public void setaddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
