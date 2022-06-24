package com.behavioural.memento;

public class MementoMain {

    public static void main(String[] args) {

        Notepad notepad = new Notepad();

        notepad.addNotes("Hello, ");
        notepad.save();
        notepad.displayCurrentNotes();
        notepad.addNotes("How ");
        notepad.addNotes("are ");
        notepad.displayCurrentNotes();
        notepad.addNotes("you ");
        notepad.addNotes("doing? ");
        notepad.save();
        notepad.displayCurrentNotes();
        notepad.addNotes("whether ");
        notepad.addNotes("is ");
        notepad.save();
        notepad.addNotes("great ");
        notepad.displayCurrentNotes();
        notepad.undo();
        notepad.addNotes("weather ");
        notepad.addNotes("is ");
        notepad.addNotes("great ");
        notepad.addNotes("today ");
        notepad.save();
        notepad.displayCurrentNotes();

        notepad.undo();
        notepad.displayCurrentNotes();

        notepad.redo();
        notepad.displayCurrentNotes();


    }
}
