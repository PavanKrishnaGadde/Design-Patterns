package com.behavioural.mediator;

public class MediatorMain {

    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange("BSE");

        Zerodha zerodha = new Zerodha(stockExchange);
        UpStox upStox = new UpStox(stockExchange);

        zerodha.placeSellOrder("MSFT", 200);
        zerodha.placeSellOrder("APPL", 40);
        zerodha.placeBuyOrder("GOOG", 200);
        zerodha.placeBuyOrder("AMZN", 15);

        upStox.createABuyOrder("MSFT",200);
        upStox.createASellOrder("GFGG", 34);
        upStox.createASellOrder("AMZN",15);
        upStox.createASellOrder("GOOG", 23);
    }
}
