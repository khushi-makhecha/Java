package com.khushi;

import com.khushi.generics.GenericsList;

public class Main {

    public static void main(String[] args) {
        var list = new GenericsList<String>();
        var iterator = list.iterator();
        list.add("a");
        list.add("b");

        while (iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
