package com.creational.abstractFactory;

import com.creational.abstractFactory.devices.Device;
import com.creational.abstractFactory.devices.GooglePixel;
import com.creational.abstractFactory.devices.Iphone14;

public class MobilePhoneFactory extends AbstractFactory{
    @Override
    Device getDevice(String type) {
        if(type.equalsIgnoreCase("IOS")) return new Iphone14();

        if(type.equalsIgnoreCase("Android")) return new GooglePixel();

        return null;
    }
}
