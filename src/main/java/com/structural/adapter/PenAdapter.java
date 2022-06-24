package com.structural.adapter;

public class PenAdapter implements Pen {
    Marker marker = new Marker();
    @Override
    public void write(String str) {
        marker.mark(str);
    }
}
