package com.behavioural.template;

public abstract class OrderingTemplate {

    public abstract void selectItems();

    public abstract void addItemsToCart();

    public abstract void checkout();

    public abstract void makePayment();

    public abstract void selectShippingMethod();

    public abstract void collectInvoice();

    public abstract boolean isOnlineOrder();

    public void processOrder() {
        selectItems();
        addItemsToCart();
        checkout();
        if(isOnlineOrder()) {
            selectShippingMethod();
        }
        makePayment();
        collectInvoice();
    }

}
