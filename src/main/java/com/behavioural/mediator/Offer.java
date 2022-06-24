package com.behavioural.mediator;

public class Offer {
    private String StockName;
    private int shares;
    private int brokerId;

    public Offer(String stockName, int shares, int brokerId) {
        StockName = stockName;
        this.shares = shares;
        this.brokerId = brokerId;
    }

    public String getStockName() {
        return StockName;
    }

    public int getShares() {
        return shares;
    }

    public int getBrokerId() {
        return brokerId;
    }
}
