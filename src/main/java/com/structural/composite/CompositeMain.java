package com.structural.composite;

public class CompositeMain {

    public static void main(String args[]) {
        Item tyre = new SimpleItem("tyre", 4000);
        Item light = new SimpleItem("frontLight", 500);
        Item glass = new SimpleItem("glass", 700);
        Item holder = new SimpleItem("holder", 980);
        Item radio = new SimpleItem("radio", 5000);
        Item engine = new SimpleItem("engine", 50000);
        Item cooler = new SimpleItem("cooler", 7700);
        Item seat = new SimpleItem("seat", 9877);
        Item wiper = new SimpleItem("wiper", 988);
        Item petrolTank = new SimpleItem("tank", 9887);
        Item signalLight = new SimpleItem("signalLight",998);

        CompositeItem door = new CompositeItem("door");
        door.setItem(holder);
        door.setItem(glass);

        CompositeItem lights = new CompositeItem("lights");
        lights.setItem(light);
        lights.setItem(signalLight);

        CompositeItem internals = new CompositeItem("internals");
        internals.setItem(seat);
        internals.setItem(radio);

        CompositeItem mainItems = new CompositeItem("main");
        mainItems.setItem(engine);
        mainItems.setItem(cooler);
        mainItems.setItem(petrolTank);

        CompositeItem externals = new CompositeItem("externals");
        externals.setItem(lights);
        externals.setItem(wiper);
        externals.setItem(tyre);
        externals.setItem(mainItems);

        CompositeItem car = new CompositeItem("car");
        car.setItem(externals);
        car.setItem(internals);
        car.setItem(door);

        System.out.println(car.getPrice());
    }



}
