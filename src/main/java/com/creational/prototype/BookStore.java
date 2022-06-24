package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable {

    String name;
    List<String> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBooks() {
        return books;
    }

    public void loadBooks() {
        for(int i=0;i<100;i++) {
            books.add("book" + i);
        }
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookStore clone() throws CloneNotSupportedException {
        BookStore bd = new BookStore();
        this.books.stream().forEach(book -> bd.books.add(book));
        return bd;
    }

}
