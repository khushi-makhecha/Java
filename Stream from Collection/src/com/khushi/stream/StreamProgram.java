//D.B.O.

package com.khushi.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StreamProgram {
    public static void show(){

        Collection<Integer> x = new ArrayList<>();
        Collections.addAll(x,1,2,15);

//        var result = x.stream();
//        System.out.println();

        x.stream().forEach(System.out::println);
    }
}