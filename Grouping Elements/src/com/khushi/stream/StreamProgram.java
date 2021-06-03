package com.khushi.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {
    public static void show(){

        List<Movies> movies = List.of(
                new Movies("a", 10, Category.ACTION),
                new Movies("b", 15, Category.ACTION),
                new Movies("c", 20, Category.SCI)
        );

        var result = movies.stream()
                .collect(Collectors.groupingBy(Movies::getCategory));
                System.out.println(result);

        System.out.println("-------------------------------------------");

        var result2 = movies.stream()
                .collect(Collectors.groupingBy(Movies::getCategory,
                        Collectors.joining(",")));
        System.out.println(result2);
    }
}