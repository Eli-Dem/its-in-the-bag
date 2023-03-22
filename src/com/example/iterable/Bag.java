package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

    private ArrayList<T> bag; // the backbone of bag

    public Bag(){
        this.bag = new ArrayList<>();
    } //constructor that creates the bag

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    } //checks the size of the bag and returns true if empty

    @Override
    public int size() {
        return this.bag.size();
    } //checks the size of the bag, using the ArrayList size method, returns the size

    @Override
    public void add(T item) {
        this.bag.add(item);
    } //adds an item to the bag, using the ArrayList add method

    @Override
    public Iterator<T> iterator() { //creates a new iterator
        return new Iterator<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() { //overwrites the hasNext method, checking the iterators index against the bag size
                return i < bag.size();
            }

            @Override
            public T next() { //overwrites the next method, returns the next object in line.
                return bag.get(i++);
            }
        };
    }
}
