package com.structural.decorator;

public class FileEncryption extends ProcessDecorator{
    public FileEncryption(FileProcessor processor) {
        super(processor);
    }

    @Override
    public void process(String fileName) {
        System.out.println("Encrypting File: " + fileName);
        super.process(fileName);
    }
}
