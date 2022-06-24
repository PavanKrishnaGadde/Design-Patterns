package com.structural.facade;

public class AccountService {

    public boolean haveEnoughMoney(int withdrawAmount) {
        return withdrawAmount<1000;
    }

    public boolean increaseMoney(int deposit) {
        return deposit>0;
    }

    public boolean decreaseMoney(int withdraw) {
        return withdraw<1000;
    }
}
