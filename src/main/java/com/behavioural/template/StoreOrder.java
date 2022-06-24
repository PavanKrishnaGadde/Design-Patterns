package com.behavioural.template;

public class StoreOrder extends OrderingTemplate{
    @Override
    public void selectItems() {
        System.out.println("Select items from the physical catalog and stacks present in the store");
    }

    @Override
    public void addItemsToCart() {
        System.out.println("Place the items in trolley");
    }

    @Override
    public void checkout() {
        System.out.println("Go to checkout counter and scan the items");
    }

    @Override
    public void makePayment() {
        System.out.println("Make payment using cash or card or net banking");
    }

    @Override
    public void selectShippingMethod() {
        System.out.println("NA");
    }

    @Override
    public void collectInvoice() {
        System.out.println("Collect invoice from the machine or cashier");
    }

    @Override
    public boolean isOnlineOrder() {
        return false;
    }
}
