package com.creational.abstractFactory;

import com.creational.abstractFactory.devices.Dell;
import com.creational.abstractFactory.devices.Device;
import com.creational.abstractFactory.devices.MacBook;

public class LaptopFactory extends AbstractFactory{
    @Override
    Device getDevice(String type) {
        if(type.equalsIgnoreCase("IOS")) return new MacBook();

        if(type.equalsIgnoreCase("Windows")) return new Dell();

        return null;
    }
}
