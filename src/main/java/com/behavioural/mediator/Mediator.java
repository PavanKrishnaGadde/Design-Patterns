package com.behavioural.mediator;

public interface Mediator {
    String getName();
    void addBroker(Broker broker);
    void sellOffer(String stockName, int shares, int brokerId);
    void buyOffer(String stockName, int shares, int brokerId);
}
