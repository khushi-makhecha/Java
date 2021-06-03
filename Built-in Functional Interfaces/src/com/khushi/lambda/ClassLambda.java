package com.khushi.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ClassLambda {
    public static void show(){
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list);

        // Imperative (loop, switch, if/else)
        for (var item : list)
            System.out.println(item);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        list.forEach((Integer item) -> {System.out.println(item);});     //-----(1)
        list.forEach(item -> System.out.println(item));                  //-----(2)

        // Declarative
        list.forEach(System.out :: println);                             //-----(3)
    }
}