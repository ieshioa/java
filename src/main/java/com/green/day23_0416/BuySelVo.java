package com.green.day23_0416;

public class BuySelVo {
    // Vo (Value Object)

    private String memId;
    private int buyCount;

    public BuySelVo (String memId, int buyCount) {
        this.memId = memId;
        this.buyCount = buyCount;
    }
    public String getMemId() {
        return memId;
    }
    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public String toString() {
        return String.format(" %s\t\t%d",memId,buyCount);
    }
}

