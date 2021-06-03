package com.khushi;

import com.khushi.generics.GenericsListD;

public class Main {

    public static void main(String[] args) {
        var list = new GenericsListD<Integer>();
        list.setX(1);
        System.out.println(list.getX());
    }
}