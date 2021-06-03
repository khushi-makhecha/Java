package com.khushi.stream;

import java.util.Arrays;

public class StreamProgram {
    public static void show(){

        int[] number = {1,2,3};
        Arrays.stream(number)
                .forEach(n -> System.out.println(n));
    }
}
