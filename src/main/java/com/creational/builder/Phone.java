package com.creational.builder;

public class Phone {
    private String os;
    private String Processor;
    private String camera;
    private String battery;
    private String color;

    public Phone() {

    }

    public Phone(String os, String processor, String camera, String battery, String color) {
        this.os = os;
        Processor = processor;
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public Phone setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone setProcessor(String processor) {
        Processor = processor;
        return this;
    }

    public Phone setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public Phone setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", Processor='" + Processor + '\'' +
                ", camera='" + camera + '\'' +
                ", battery='" + battery + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
