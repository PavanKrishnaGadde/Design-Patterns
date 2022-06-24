package com.behavioural.chainOfResponsibility;

public class CORMain {

    public static void main(String[] args) {
        Processor adder = new Adder();
        Processor subtractor = new Subtractor();
        Processor divider = new Divider();
        Processor multipler = new Multiplier();

        adder.setNextProcessor(subtractor);
        subtractor.setNextProcessor(multipler);
        multipler.setNextProcessor(divider);

        Request request = new Request(30,27,"multiply");
        adder.process(request);

        Request request1 = new Request(8888,1122, "subtract");
        adder.process(request1);
    }
}
