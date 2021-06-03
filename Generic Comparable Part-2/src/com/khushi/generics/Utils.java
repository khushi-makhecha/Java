package com.khushi.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <T> void print(T key, T value){
        System.out.println(key + "=" + value);
    }
}