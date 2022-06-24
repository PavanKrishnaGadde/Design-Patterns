package com.structural.facade;

public class Authenticator {

    public boolean isAccountExist(int accountNum) {
        return accountNum > 34440;
    }

    public boolean authenticatePassword(int password) {
        return  password%1000==0;
    }
}
