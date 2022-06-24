package com.structural.proxy;

public class ATMProxy implements ATMMachine{
    @Override
    public String getStatus() {
        ATMMachine atm = new RealATMMachine();
        return atm.getStatus();
    }

    @Override
    public double getCashAvailable() {
        ATMMachine atm = new RealATMMachine();
        return atm.getCashAvailable();
    }
}
