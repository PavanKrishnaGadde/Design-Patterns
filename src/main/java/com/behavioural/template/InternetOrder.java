package com.behavioural.template;

public class InternetOrder extends OrderingTemplate{
    @Override
    public void selectItems() {
        System.out.println("Select items from the product listing page");
    }

    @Override
    public void addItemsToCart() {
        System.out.println("select items and add items to cart");
    }

    @Override
    public void checkout() {
        System.out.println("got to shopping cart page and click on checkout");
    }

    @Override
    public void makePayment() {
        System.out.println("Make payment using card or net banking");
    }

    @Override
    public void selectShippingMethod() {
        System.out.println("Select pick in store or ship to home");
    }

    @Override
    public void collectInvoice() {
        System.out.println("Check email for invoice");
    }

    @Override
    public boolean isOnlineOrder() {
        return true;
    }
}

