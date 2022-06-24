package com.structural.facade;

public class ATM {
    private TransactionManger transactionManger;
    private Authenticator authenticator;
    private AccountService accountService;

    public ATM() {
        transactionManger = new TransactionManger();
        authenticator = new Authenticator();
        accountService = new AccountService();
    }

    public void login(int id, int pass) {
        if(!authenticator.isAccountExist(id) || !authenticator.authenticatePassword(pass)) {
            throw new RuntimeException("Invalid Account");
        }
    }

    public void withdraw(int amount) {
        transactionManger.startTransaction();
        if(accountService.haveEnoughMoney(amount)) {
            if(accountService.decreaseMoney(amount)) {
                transactionManger.transactionSuccess();
            } else transactionManger.transactionFailed();
        } else transactionManger.transactionFailed();

        transactionManger.endTransaction();
    }

    public void deposit(int amount) {
        transactionManger.startTransaction();
        if(accountService.increaseMoney(amount)) {
            transactionManger.transactionSuccess();
        } else transactionManger.transactionFailed();

        transactionManger.endTransaction();
    }

}
