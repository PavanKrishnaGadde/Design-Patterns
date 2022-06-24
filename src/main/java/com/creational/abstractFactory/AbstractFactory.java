package com.creational.abstractFactory;

import com.creational.abstractFactory.devices.Device;

public abstract class AbstractFactory {
    abstract Device getDevice(String type);
}
