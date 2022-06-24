package com.behavioural.template;

public class TemplateMain {
    public static void main(String[] args) {
        StoreOrder ordering = new StoreOrder();
        ordering.processOrder();

        System.out.println("--------------------------------");

        InternetOrder ordering2 = new InternetOrder();
        ordering2.processOrder();
    }
}
