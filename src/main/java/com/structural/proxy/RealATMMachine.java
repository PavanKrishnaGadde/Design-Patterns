package com.structural.proxy;

public class RealATMMachine implements ATMMachine{

    private String status;
    private double cashInStore;

    @Override
    public String getStatus() {
        System.out.println("Getting ATM Status");
        return status;
    }

    @Override
    public double getCashAvailable() {
        System.out.println("Getting Cash Data");
        return cashInStore;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCashInStore(double cashInStore) {
        this.cashInStore = cashInStore;
    }
}
