package com.behavioural.command;

public class DeviceVolumeDownCommand implements Command {
    private Device device;

    public DeviceVolumeDownCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
