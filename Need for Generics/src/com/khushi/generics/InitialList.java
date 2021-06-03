package com.khushi.generics;

public class InitialList {
    private int[] items = new int[10];
    private int count = 0;

    public void add(int item){
        items[count++] = item;
    }

    public int get(int index){
        return items[index];
    }
}
