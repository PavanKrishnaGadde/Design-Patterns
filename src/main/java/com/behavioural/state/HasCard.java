package com.behavioural.state;

public class HasCard implements ATMState{

    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Only one card can be inserted at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setCurrentState(atmMachine.getHasNoCard());
    }

    @Override
    public void enterPIN(int pin) {
        if(pin == 1234) {
            System.out.println("Correct PIN");
            atmMachine.setCurrentState(atmMachine.getPinVerified());
        } else {
            System.out.println("Wrong PIN");
            System.out.println("Ejecting the card");
            atmMachine.setCurrentState(atmMachine.getHasNoCard());
            System.out.println("Card Ejected");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        System.out.println("Please verify the PIN Number first and try again!");
    }
}
