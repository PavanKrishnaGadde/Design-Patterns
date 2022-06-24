package com.behavioural.iterator;

public class ArrayIterator<T> implements Iterator<T>{
    private T[] array;
    private int size;
    private int curr;

    public ArrayIterator(T[] array, int size) {
        this.array = array;
        this.size = size;
        this.curr=0;
    }

    @Override
    public boolean hasNext() {
        return this.curr<this.size;
    }

    @Override
    public T next() {
        return array[curr++];
    }
}
