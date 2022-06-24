package com.behavioural.command;

public class DeviceOFFCommand implements Command{

    private Device device;

    public DeviceOFFCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}

