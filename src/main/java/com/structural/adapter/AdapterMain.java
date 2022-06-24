package com.structural.adapter;

public class AdapterMain {

    public  static void main(String args[]) {
        Assignment as = new Assignment();
        Pen pen = new PenAdapter();
        as.setPen(pen);
        as.doWork("This is the homework");
    }

}
