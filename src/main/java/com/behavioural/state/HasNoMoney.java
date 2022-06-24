package com.behavioural.state;

public class HasNoMoney implements ATMState{
    private ATMMachine atmMachine;

    public HasNoMoney(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM is currently out of cash");
    }

    @Override
    public void ejectCard() {
        System.out.println("No Card inserted. ATM is currently out of cash");
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("ATM is currently out of cash");
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("ATM is currently out of cash");
    }
}
