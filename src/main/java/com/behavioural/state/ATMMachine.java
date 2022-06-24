package com.behavioural.state;

public class ATMMachine {
    ATMState hasCard;
    ATMState hasNoCard;
    ATMState pinVerified;
    ATMState outOfCash;
    ATMState currentState;
    boolean isPINNumberVerified;
    double availableAmount;

    public ATMMachine(int availableAmount) {
        hasCard = new HasCard(this);
        hasNoCard = new HasNoCard(this);
        pinVerified = new CorrectPINEntered(this);
        outOfCash = new HasNoMoney(this);
        currentState = availableAmount > 0 ? hasNoCard : outOfCash;
        this.availableAmount = availableAmount;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPIN(int PIN) {
        currentState.enterPIN(PIN);
    }

    public void withdrawAmount(double amount) {
        currentState.withdrawMoney(amount);
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getHasNoCard() {
        return hasNoCard;
    }

    public ATMState getPinVerified() {
        return pinVerified;
    }

    public ATMState getOutOfCash() {
        return outOfCash;
    }

    public boolean isPINNumberVerified() {
        return isPINNumberVerified;
    }

    public void setPINNumberVerified(boolean PINNumberVerified) {
        isPINNumberVerified = PINNumberVerified;
    }

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }
}
