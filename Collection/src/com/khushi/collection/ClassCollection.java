package com.khushi.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ClassCollection {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");

        collection.clear();
        System.out.println(collection.isEmpty());
    }
}