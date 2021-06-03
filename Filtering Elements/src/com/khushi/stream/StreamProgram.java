package com.khushi.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamProgram {
    public static void show(){

        List<Movies> movies = List.of(                                  // Declaring as var movies = List.of also gives the same info of the object
                new Movies("a", 10),                          // being type List<E>
                new Movies("b", 15),
                new Movies("c", 20)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .forEach(n -> System.out.println(n));

        var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(name -> name.getTitle());
        System.out.println(result);

        var result2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(name -> name.getTitle());
        result2.forEach(n -> System.out.println(n));

        var result3 = movies.stream()
                .filter(m -> m.getLikes() > 10);
        result3.forEach(n -> System.out.println(n.getTitle()));

        Predicate<Movies> isPopular = m -> m.getLikes() > 15;
        var result4 = movies.stream()
                .filter(isPopular);
        result4.forEach(n -> System.out.println(n.getTitle()));
    }
}