package com.green.day22_0415;

public class MemberEntity {
    private String memId;
    private String memName;
    private int memNumber;
    private String addr;
    private String phone1;
    private String phone2;
    private int height;
    private String debutDate;

    public String getMemId() { return memId; }
    public String getMemName() { return memName; }
    public int getMemNumber() { return memNumber; }
    public String getAddr() { return addr; }
    public String getPhone1() { return phone1; }
    public String getPhone2() { return phone2; }
    public int getHeight() { return height; }
    public String getDebutDate() { return debutDate; }
    public void setMemId(String memId) {
        this.memId = memId;
    }
    public void setMemName(String memName) {
        this.memName = memName;
    }
    public void setMemNumber(int memNumber) {
        this.memNumber = memNumber;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "memId='" + memId + '\'' +
                ", memName='" + memName + '\'' +
                ", memNumber=" + memNumber +
                ", addr='" + addr + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", height=" + height +
                ", debutDate='" + debutDate + '\'' +
                '}';
    }
}
