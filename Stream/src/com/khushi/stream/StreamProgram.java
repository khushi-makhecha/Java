package com.khushi.stream;

import java.util.List;

public class StreamProgram {
    public static void show(){
        List<Movies> movies = List.of(
                new Movies("a",10),
                new Movies("b",15),
                new Movies("c",20)
        );

        int count = 0;
        for (var movie : movies){
            if (movie.getLikes() > 10)
                count++;
        }
        System.out.println(count);
        
        // Alternative of the above method is Stream which can be applied as follows:

        var count2 = movies.stream().filter(movies1 -> movies1.getLikes() > 10).count();
        System.out.println(count2);
    }
}