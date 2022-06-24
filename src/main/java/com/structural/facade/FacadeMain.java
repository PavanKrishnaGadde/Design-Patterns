package com.structural.facade;

public class FacadeMain {

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.login(222311313,890000000);
        atm.deposit(20000);
        atm.withdraw(90887);
    }
}
