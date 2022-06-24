package com.behavioural.command;

public class TV implements Device{
    private int volume;

    public TV() {
        this.volume = 0;
    }

    @Override
    public void on() {
        System.out.println("TV ON");
    }

    @Override
    public void off() {
        System.out.println("TV OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume: " + volume);
    }
}
