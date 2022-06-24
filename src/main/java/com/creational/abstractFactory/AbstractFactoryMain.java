package com.creational.abstractFactory;

import com.creational.abstractFactory.devices.Device;

import java.util.Scanner;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Device Type (Mobile/Laptop):");
        String deviceType = sc.nextLine();
        FactoryProvider fp = new FactoryProvider();
        AbstractFactory af = fp.getFactory(deviceType);

        if(af != null) {
            System.out.println("Enter OS Type:");
            String osType = sc.nextLine();
            Device device = af.getDevice(osType);
            if(device != null) {
                device.display();
            } else {
                throw new RuntimeException("Device Not Found!");
            }

        }

    }
}
