package com.khushi.stream;

import java.util.List;

public class StreamProgram {
    public static void show(){
        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("c", 15)
        );

        movies.stream()
                .forEach(m -> System.out.println(m.getLikes()));

        System.out.println("---------------------------------------------");

        movies.stream()
                .map(m -> m.getLikes())
                .forEach(m -> System.out.println(m));

        System.out.println("---------------------------------------------");

        movies.stream()
                .map(m -> m.getLikes())
                .distinct()
                .forEach(m -> System.out.println(m));
    }
}
