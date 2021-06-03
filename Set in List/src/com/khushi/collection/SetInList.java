package com.khushi.collection;

import java.util.*;

public class SetInList {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","b","c","c");
        System.out.println(collection);

        Set<String> set = new HashSet<>(collection);
        System.out.println(set);
    }
}
