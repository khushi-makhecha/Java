package com.khushi.stream;

import java.util.List;
import java.util.Optional;

public class StreamProgram {
    public static void show(){

        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("c", 20),
                new Movies("b", 15)
        );

        /*
            [10, 15, 20]
            [25, 20]
            [45]
         */

        Optional<Integer> sum = movies.stream()
                .map(m -> m.getLikes())
                .reduce((a,b) -> a + b);
        System.out.println(sum.get());

        System.out.println("-------------------------------------");

        Optional<Integer> sum1 = movies.stream()
                .map(Movies::getLikes)
                .reduce(Integer::sum);
        System.out.println(sum1.get());
    }
}
