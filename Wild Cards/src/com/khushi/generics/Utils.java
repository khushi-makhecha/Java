package com.khushi.generics;

public class Utils {

//    public static <K,V> void print(K key, V value){
//        System.out.println(key + "=" + value);
//    }

    public static void print(Users user){
        System.out.println(user);
    }

    public static void printUser(GenericsList<?> user){
        user.get(user);
    }
}