package com.behavioural.mediator;

public class Zerodha extends Broker{
    public Zerodha(Mediator mediator) {
        super(mediator);
        System.out.println("Created an account for Zerodha With Mediator: " + mediator.getName());
    }

    public void placeBuyOrder(String stock, int shares) {
        System.out.println("Buy Order created with Zerodha");
        super.buyOffer(stock,shares);
    }

    public void placeSellOrder(String stock, int shares) {
        System.out.println("Sell Order created with Zerodha");
        super.sellOffer(stock,shares);
    }
}

