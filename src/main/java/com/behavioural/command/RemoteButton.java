package com.behavioural.command;

public class RemoteButton {

    private Command command;

    public RemoteButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
