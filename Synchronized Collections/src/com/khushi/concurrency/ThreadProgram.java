package com.khushi.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ThreadProgram {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Collection<Integer> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(1,2,3));

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1,2,3));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4,5,6));
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(collection);
    }
}

// FINAL CODE MODIFICATION PENDING