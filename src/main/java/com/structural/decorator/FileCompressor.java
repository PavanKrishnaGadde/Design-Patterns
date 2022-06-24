package com.structural.decorator;

public class FileCompressor extends ProcessDecorator{
    public FileCompressor(FileProcessor processor) {
        super(processor);
    }

    @Override
    public void process(String fileName) {
        System.out.println("Compressing File: " + fileName);
        super.process(fileName);
    }
}
