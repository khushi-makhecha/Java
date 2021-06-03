package com.khushi.stream;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamProgram {
    public static void show(){
        var result = Stream.of(1,2,3,4);
        System.out.println(result);

        var stream = Stream.generate(() -> Math.random());
        stream.limit(4)
                .forEach(n -> System.out.println(n));

        Stream.iterate(1,n -> n + 1)
                .limit(5)
                .forEach(n -> System.out.println(n));

        List<Movies> movies = List.of(                                  // Declaring as var movies = List.of also gives the same info of the object
                new Movies("a", 10),                          // being type List<E>
                new Movies("b", 15),
                new Movies("c", 20)
        );

        movies.stream()
                .map(movies1 -> movies1.getTitle())
                .forEach(name -> System.out.println(name));

        // Alternative to above :

        movies.stream()
                .forEach(movies1 -> System.out.println(movies1.getTitle()));

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(name -> System.out.println(name));

        movies.stream()
                .mapToInt(new ToIntFunction<Movies>() {
                    @Override
                    public int applyAsInt(Movies value) {
                        return value.getLikes();
                    }
                })
                .forEach(name -> System.out.println(name));
    }
}
