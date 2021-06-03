package com.khushi.collection;

import java.util.*;

public class SetOperations {
    public static void show(){
        //List<String> list = new ArrayList<>(); Alternative to this is given here:
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));

//        set1.addAll(set2);                          //Union
//        System.out.println(set1);

//        set1.retainAll(set2);                       //Intersection
//        System.out.println(set1);

        set1.removeAll(set2);                         //Set Difference
        System.out.println(set1);
        
        //Use any one set operation at a time to understand correctly.
    }
}
