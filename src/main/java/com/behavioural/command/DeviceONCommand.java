package com.behavioural.command;

public class DeviceONCommand implements Command{

    private Device device;

    public DeviceONCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
