package com.creational.builder;

public class PhoneBuilder {
    private String os;
    private String processor;
    private String camera;
    private String battery;
    private String color;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, processor, camera, battery, color);
    }
}
