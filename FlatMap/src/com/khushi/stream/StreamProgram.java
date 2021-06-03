package com.khushi.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamProgram {
    public static void show(){
        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
        stream.forEach(list -> System.out.println(list));

        /* Function of FlatMap :
         Stream<List<x>> -> Stream<x>
         */

        var stream2 = Stream.of(List.of(1,2,3), List.of(4,5,6));
        stream2.flatMap(list -> list.stream())                                   //flatMap() is used to iterate inside the stream elements.
                .forEach(list -> System.out.println(list));
    }
}