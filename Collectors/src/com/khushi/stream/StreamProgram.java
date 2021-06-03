package com.khushi.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProgram {
    public static void show(){

        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("b", 15),
                new Movies("c", 20)
        );

        var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("---------------------------------------------");

        var result2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toSet());
        System.out.println(result2);

        System.out.println("---------------------------------------------");

        /* FOR toMap :

            key : value
            value : likes
         */

        var result3 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movies::getTitle, Movies::getLikes));
        System.out.println(result3);

        System.out.println("---------------------------------------------");

        var result4 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movies::getTitle, m1 -> m1));
        System.out.println(result4);

        System.out.println("---------------------------------------------");

        var result5 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movies::getTitle, Function.identity()));
        System.out.println(result5);

        System.out.println("---------------------------------------------");

        var result6 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movies::getLikes, Function.identity()));
        System.out.println(result6);

        System.out.println("---------------------------------------------");

        var result7 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(m -> m.getLikes()));
        System.out.println(result7);

        System.out.println("---------------------------------------------");

        var result8 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movies::getLikes));
        System.out.println(result8);

        System.out.println("---------------------------------------------");

        var variable1 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movies::getLikes);
        variable1.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        var variable2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movies::getTitle);
        variable2.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        var variable3 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movies::getTitle)
                .collect(Collectors.joining(","));
        System.out.println(variable3);
    }
}