package com.creational.prototype;

public class PrototypeMain {

    public static void main(String args[]) throws CloneNotSupportedException {

        BookStore bs = new BookStore();
        bs.setName("pk books");
        bs.loadBooks();
        System.out.println(bs);

        ShoeStore ss = new ShoeStore();
        ss.setName("pk shoes");
        ss.loadshoes();
        System.out.println(ss);

        BookStore bs2 = bs.clone();
        bs2.setName("pk books 2");
        System.out.println(bs2);
    }
}
