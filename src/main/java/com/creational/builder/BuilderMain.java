package com.creational.builder;

public class BuilderMain {

    public static void main(String args[]) {
        Phone phone = new Phone().setOs("ios").setBattery("5000mAh").setCamera("40MP").setColor("Black").setProcessor("Apple");
        System.out.println(phone);

        Phone pb = new PhoneBuilder().setOs("android").setProcessor("Qualcomm").getPhone();
        System.out.println(pb);
    }

}
