package com.behavioural.command;

public class CommandMain {

    public static void main(String[] args) {

        Device device = new TV();

        RemoteButton onButton = new RemoteButton(new DeviceONCommand(device));
        RemoteButton offButton = new RemoteButton(new DeviceOFFCommand(device));

        RemoteButton upButton = new RemoteButton(new DeviceVolumeUpCommand(device));
        RemoteButton downButton = new RemoteButton(new DeviceVolumeDownCommand(device));

        onButton.press();

        upButton.press();
        upButton.press();
        downButton.press();
        downButton.press();
        upButton.press();
        upButton.press();

        offButton.press();


        Device device2 = new Radio();

        RemoteButton onButton2 = new RemoteButton(new DeviceONCommand(device2));
        RemoteButton offButton2 = new RemoteButton(new DeviceOFFCommand(device2));

        RemoteButton upButton2 = new RemoteButton(new DeviceVolumeUpCommand(device2));
        RemoteButton downButton2 = new RemoteButton(new DeviceVolumeDownCommand(device2));

        onButton2.press();

        upButton2.press();
        downButton2.press();
        upButton2.press();
        upButton2.press();

        offButton2.press();
    }
}
