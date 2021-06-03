package com.khushi.stream;

import java.util.Comparator;
import java.util.List;

public class StreamProgram {
    public static void show(){

        List<Movies> movies = List.of(
                new Movies("a", 10),
                new Movies("c", 20),
                new Movies("b", 15)
        );

        System.out.println("------------------------------------------------");

        var count = movies.stream()
                .count();
        System.out.println(count);

        System.out.println("------------------------------------------------");

        var match = movies.stream()
                .anyMatch(m -> m.getLikes() > 15);
        System.out.println(match);

        System.out.println("------------------------------------------------");

        var match2 = movies.stream()
                .allMatch(m -> m.getLikes() > 15);
        System.out.println(match2);

        System.out.println("------------------------------------------------");

        var match3 = movies.stream()
                .noneMatch(m -> m.getLikes() > 5);
        System.out.println(match3);

        System.out.println("------------------------------------------------");

        var match4 = movies.stream()
                .noneMatch(m -> m.getLikes() > 15);
        System.out.println(match4);

        System.out.println("------------------------------------------------");

        var match5 = movies.stream()
                .noneMatch(m -> m.getLikes() > 25);
        System.out.println(match5);

        System.out.println("------------------------------------------------");

        var find = movies.stream()
                .findFirst()
                .get();
        System.out.println(find);

        System.out.println("------------------------------------------------");

        var find2 = movies.stream()
                .findFirst()
                .get();
        System.out.println(find2.getTitle());

        System.out.println("------------------------------------------------");

        var find3 = movies.stream()
                .findAny()
                .get();
        System.out.println(find3.getTitle());

        System.out.println("------------------------------------------------");

        var obtain = movies.stream()
                .max(Comparator.comparing(Movies::getLikes))
                .get();
        System.out.println(obtain.getTitle());

        System.out.println("------------------------------------------------");

        var obtain2 = movies.stream()
                .min(Comparator.comparing(Movies::getLikes))
                .get();
        System.out.println(obtain2.getTitle());

    }
}
