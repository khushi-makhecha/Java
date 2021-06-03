// D.B.O.

package com.khushi.stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamProgram {
    public static void show(){
        var list = new ArrayList<>();
        Collections.addAll(list, 1,2,15);
        list.stream().forEach(System.out::println);
    }
}
