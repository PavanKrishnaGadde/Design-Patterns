package com.behavioural.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPIN(int pin);
    void withdrawMoney(double amount);
}
