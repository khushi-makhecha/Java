package com.khushi.stream;

import java.util.Comparator;
import java.util.List;

public class StreamProgram {
    public static void show(){

        List<Movies> movies = List.of (
                new Movies("a", 10),
                new Movies("c", 20),
                new Movies("b", 15)
        );

        movies.stream()
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("----------------------------------------------------");

        movies.stream()
                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("----------------------------------------------------");

        movies.stream()
                .sorted(new Comparator<Movies>() {
                    @Override
                    public int compare(Movies o1, Movies o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                })
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("----------------------------------------------------");

        movies.stream()
                .sorted(Comparator.comparing(movies1 -> movies1.getTitle()))
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("----------------------------------------------------");

        movies.stream()
                .sorted(Comparator.comparing(Movies::getTitle))
                .forEach(m -> System.out.println(m.getTitle()));

        System.out.println("----------------------------------------------------");

        movies.stream()
                .sorted(Comparator.comparing(Movies::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));
    }
}