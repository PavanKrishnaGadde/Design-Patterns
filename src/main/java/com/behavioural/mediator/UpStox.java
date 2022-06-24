package com.behavioural.mediator;

public class UpStox extends Broker{
    public UpStox(Mediator mediator) {
        super(mediator);
        System.out.println("Created an account for UpStox With Mediator: " + mediator.getName());
    }

    public void createABuyOrder(String stock, int shares) {
        System.out.println("Buy Order created with upstox");
        super.buyOffer(stock,shares);
    }

    public void createASellOrder(String stock, int shares) {
        System.out.println("Sell Order created with upstox");
        super.sellOffer(stock,shares);
    }
}
