package com.behavioural.mediator;

public class Broker {
    int brokerId;
    Mediator mediator;

    public Broker(Mediator mediator) {
        this.mediator = mediator;
        mediator.addBroker(this);
    }

    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    public void sellOffer(String stockId, int shares) {
        mediator.sellOffer(stockId,shares,this.brokerId);
    }

    public void buyOffer(String stockId, int shares) {
        mediator.buyOffer(stockId,shares,this.brokerId);
    }
}
