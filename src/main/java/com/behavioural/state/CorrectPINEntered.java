package com.behavioural.state;

public class CorrectPINEntered implements ATMState{

    private ATMMachine atmMachine;

    public CorrectPINEntered(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Only one card can be inserted at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected!!");
        atmMachine.setCurrentState(atmMachine.getHasNoCard());
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("PIN already verified");
    }

    @Override
    public void withdrawMoney(double amount) {
        if(amount<= atmMachine.getAvailableAmount()) {
            System.out.println("Dispensing the amount: " + amount);
            atmMachine.setAvailableAmount(atmMachine.getAvailableAmount() - amount);
        } else {
            System.out.println("Amount not available. Please try entering lesser amount");
        }

        if(atmMachine.getAvailableAmount()<=0) {
            atmMachine.setCurrentState(atmMachine.getOutOfCash());
        }

    }
}
