package com.khushi.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        List<Movies> movies = List.of(
                new Movies("a", 10, Category.ACTION),
                new Movies("b", 15, Category.ACTION),
                new Movies("c", 20, Category.SCI)
        );

        var result = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 15));

        System.out.println(result);

        System.out.println("-------------------------------------------------------------");

        var result2 = movies.stream()
                .collect(Collectors.partitioningBy((m -> m.getLikes() > 15),
                        Collectors.mapping(Movies::getTitle,
                                Collectors.joining(","))
                ));

        System.out.println(result2);

        System.out.println("-------------------------------------------------------------");

        var result3 = movies.stream()
                .collect(Collectors.partitioningBy((m -> m.getCategory() == Category.ACTION),
                        Collectors.mapping(Movies::getTitle,
                                Collectors.joining(","))
                ));
        System.out.println(result3);
    }
}
