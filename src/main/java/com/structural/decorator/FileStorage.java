package com.structural.decorator;

public class FileStorage implements FileProcessor{
    @Override
    public void process(String fileName) {
        System.out.println("Storing File: " + fileName);
    }
}
