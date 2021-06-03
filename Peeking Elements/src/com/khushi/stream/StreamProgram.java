package com.khushi.stream;

import com.khushi.Movies;

import java.util.List;

public class StreamProgram {
    public static void show(){
        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("b", 15),
                new Movies("c", 20)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(m1 -> m1.getTitle())
                .forEach(t -> System.out.println(t));

        System.out.println("---------------------------------------");

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m0 -> System.out.println("Filtered" + m0.getTitle()))                         // peek() checks whether the statements are getting executed without any interruption or problem.
                .map(m1 -> m1.getTitle())
                .forEach(t -> System.out.println(t));

        System.out.println("---------------------------------------");

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m0 -> System.out.println("Filtered" + m0.getTitle()))
                .map(m1 -> m1.getTitle())
                .peek(m2 -> System.out.println("Mapped" + m2))
                .forEach(t -> System.out.println(t));

        // Observe the variation in  'Stream<String>' after replacement of map(m1->m1.getTitle()) by map(m1->m1.getLikes())
    }
}