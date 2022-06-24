package com.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        // store compressed and encrypted file
        FileProcessor fp = new FileEncryption(new FileCompressor(new FileStorage()));
        fp.process("API docs");

        //Store encrypted file
        FileProcessor fp2 = new FileEncryption(new FileStorage());
        fp2.process("API docs");

        //Store compressed file
        FileProcessor fp3 = new FileCompressor(new FileStorage());
        fp3.process("API docs");
    }
}
