package com.structural.facade;

public class TransactionManger {

    public void startTransaction() {
        System.out.println("Transaction Started");
    }

    public void transactionFailed() {
        System.out.println("Transaction Failed");
    }

    public void transactionSuccess() {
        System.out.println("Transaction Success");
    }

    public void endTransaction() {
        System.out.println("Transaction Ended");
    }
}
