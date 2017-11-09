package com.company;

public class Id {

    private int id = 0;

    public int getNext() {
        id = id+1;
        return id;
    }

    public int getLast() {
        return id-1;
    }

    public int getCurrent() {
        return id;
    }

}
