package com.behavioural.chainOfResponsibility;

public interface Processor {
    void setNextProcessor(Processor next);
    void process(Request request);
}
