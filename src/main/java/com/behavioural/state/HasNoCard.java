package com.behavioural.state;

public class HasNoCard implements ATMState{
    private ATMMachine atmMachine;

    public HasNoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted!!");
        atmMachine.setCurrentState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card present");
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("Please insert a card");
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Please insert a card");
    }
}
