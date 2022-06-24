package com.structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {

        RealATMMachine realATM = new RealATMMachine();
        realATM.setStatus("Working");
        realATM.setCashInStore(100000.00);

        // below is object exposed to users;

        ATMMachine atm = new ATMProxy();
        atm.getStatus();
        atm.getCashAvailable();
    }
}
