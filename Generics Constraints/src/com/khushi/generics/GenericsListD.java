package com.khushi.generics;

public class GenericsListD <T extends Number> {
    private T x;
    private int count;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

//    public void add(T item){
//        items[count++] = item;
//    }
//
//    public T get(int index){
//        return items[index];
//    }
}
