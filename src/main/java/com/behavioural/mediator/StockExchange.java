package com.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Mediator{
    private String name;
    private List<Offer> buyOffers;
    private List<Offer> sellOffers;
    int brokerCount;

    public StockExchange(String name) {
        this.name = name;
        buyOffers = new ArrayList<>();
        sellOffers = new ArrayList<>();
        brokerCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addBroker(Broker broker) {
        brokerCount++;
        broker.setBrokerId(brokerCount);
    }

    @Override
    public void sellOffer(String stockName, int shares, int brokerId) {
        boolean isSold = false;
        for(Offer offer: buyOffers) {
            if(offer.getStockName().equalsIgnoreCase(stockName) && offer.getShares() == shares) {
                isSold = true;
                buyOffers.remove(offer);
                System.out.println(shares + " shares of " + stockName + " sold to " + offer.getBrokerId());
                break;
            }
        }

        if(!isSold) {
            Offer offer = new Offer(stockName,shares,brokerId);
            sellOffers.add(offer);
            System.out.println(shares + " shares of " + stockName + " added to sell offers inventory");
        }
    }

    @Override
    public void buyOffer(String stockName, int shares, int brokerId) {
        boolean isBought = false;
        for(Offer offer: sellOffers) {
            if(offer.getStockName().equalsIgnoreCase(stockName) && offer.getShares() == shares) {
                isBought = true;
                sellOffers.remove(offer);
                System.out.println(shares + " shares of " + stockName + " bought from " + offer.getBrokerId());
                break;
            }
        }

        if(!isBought) {
            Offer offer = new Offer(stockName,shares,brokerId);
            buyOffers.add(offer);
            System.out.println(shares + " shares of " + stockName + " added to buy offers inventory");
        }
    }
}
