package com.khushi.stream;

import java.util.List;

public class StreamProgram {
    public static void show(){
        List<Movies> movies = List.of(                                  // Declaring as var movies = List.of also gives the same info of the object
                new Movies("a", 10),                          // being type List<E>
                new Movies("b", 15),
                new Movies("c", 20)
        );

        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getLikes()));

        System.out.println("----------------------------------------------------");

        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getLikes()));

        /* PRACTICAL EXAMPLE OF ABOVE CONCEPTS :
             # Articles = 1000
             # Articles per page = 10
             Find : 4th page

             ==> skip(30) = skip((page - 1) * pageSize);
             ==> limit(10) = limit(pageSize);
         */

        System.out.println("----------------------------------------------------");

        movies.stream()
                .takeWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println(m.getLikes()));

        System.out.println("----------------------------------------------------");

        List<Movies> moviesReshuffled = List.of(                                 // Jumbled the above sequence of above instance 'movies'
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("c", 15)
        );

        moviesReshuffled.stream()
                .takeWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println(m.getLikes()));

        System.out.println("----------------------------------------------------");

        movies.stream()                                                              // Original Sequence
                .dropWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println(m.getLikes()));

        System.out.println("----------------------------------------------------");

        moviesReshuffled.stream()                                                   // Reshuffled Sequence
                .dropWhile(m -> m.getLikes() < 20)
                .forEach(m -> System.out.println(m.getLikes()));
    }
}