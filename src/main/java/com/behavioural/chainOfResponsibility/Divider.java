package com.behavioural.chainOfResponsibility;

public class Divider implements Processor{
    private Processor next;
    @Override
    public void setNextProcessor(Processor next) {
        this.next = next;
    }

    @Override
    public void process(Request request) {
        if(request.getOperation().equalsIgnoreCase("divide")) {
            System.out.println("dividing " + request.getNumber1() + " and" + request.getNumber2());
            System.out.println("Answer is: " + (request.getNumber1()+request.getNumber2()));
        } else {
            System.out.println("Ignoring divide operation");
        }

        if(next != null) {
            next.process(request);
        } else {
            System.out.println("End of chain");
        }
    }
}