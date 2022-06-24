package com.structural.decorator;

public class ProcessDecorator implements FileProcessor{

    protected FileProcessor processor;

    public ProcessDecorator(FileProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void process(String fileName) {
        this.processor.process(fileName);
    }
}
