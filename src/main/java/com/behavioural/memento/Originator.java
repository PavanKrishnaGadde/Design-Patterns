package com.behavioural.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }

}
