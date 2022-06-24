package com.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList;

    public CareTaker() {
        mementoList = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int id) {
        return id < mementoList.size() ? mementoList.get(id) : null;
    }
}
