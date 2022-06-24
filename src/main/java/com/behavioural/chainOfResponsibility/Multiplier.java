package com.behavioural.chainOfResponsibility;

public class Multiplier implements Processor{
    private Processor next;
    @Override
    public void setNextProcessor(Processor next) {
        this.next = next;
    }

    @Override
    public void process(Request request) {
        if(request.getOperation().equalsIgnoreCase("multiply")) {
            System.out.println("multiplying " + request.getNumber1() + " and" + request.getNumber2());
            System.out.println("Answer is: " + (request.getNumber1()*request.getNumber2()));
        } else {
            System.out.println("Ignoring multiply operation");
        }

        if(next != null) {
            next.process(request);
        } else {
            System.out.println("End of chain");
        }
    }
}
