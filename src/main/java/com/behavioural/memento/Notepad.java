package com.behavioural.memento;

public class Notepad {
    private String notes;
    private Originator originator;
    private CareTaker careTaker;
    private int savedVersions;
    private int currentVersion;

    public Notepad() {
        notes = "";
        originator = new Originator();
        careTaker = new CareTaker();
        savedVersions = 0;
        currentVersion = -1;
    }

    public void addNotes(String newNotes) {
        notes += newNotes;
        originator.setState(notes);
    }

    public void displayCurrentNotes() {
        System.out.println(notes);
    }

    public void save() {
        Memento memento = originator.createMemento();
        careTaker.addMemento(memento);
        savedVersions++;
        currentVersion = savedVersions - 1;
    }

    public void undo() {
        if(currentVersion>0) {
            currentVersion--;
            notes = careTaker.getMemento(currentVersion).getState();
        }
    }

    public void redo() {
        if(currentVersion<savedVersions-1) {
            currentVersion++;
            notes = careTaker.getMemento(currentVersion).getState();
        }
    }


}
