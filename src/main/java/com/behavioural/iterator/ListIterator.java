package com.behavioural.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T>{
    private List<T> list;
    private int size;
    private int curr;

    public ListIterator(List<T> list) {
        this.list = list;
        this.size = list.size();
        this.curr = 0;
    }

    @Override
    public boolean hasNext() {
        return this.curr<this.size;
    }

    @Override
    public T next() {
        return list.get(curr++);
    }
}
