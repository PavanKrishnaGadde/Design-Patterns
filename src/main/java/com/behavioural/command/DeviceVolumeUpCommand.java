package com.behavioural.command;

public class DeviceVolumeUpCommand implements Command {
    private Device device;

    public DeviceVolumeUpCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}

