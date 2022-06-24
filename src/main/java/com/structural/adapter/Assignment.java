package com.structural.adapter;

public class Assignment {
    Pen pen;

    public void setPen(Pen pen) {
        this.pen =pen;
    }

    public void doWork(String work) {
        pen.write(work);
    }
}
