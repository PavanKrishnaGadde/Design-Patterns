package com.behavioural.command;

public class Radio implements Device{
    private int volume;

    public Radio() {
        this.volume = 0;
    }

    @Override
    public void on() {
        System.out.println("Radio ON");
    }

    @Override
    public void off() {
        System.out.println("Radio OFF");
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
