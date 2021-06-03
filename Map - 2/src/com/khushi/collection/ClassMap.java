package com.khushi.collection;

import java.util.HashMap;
import java.util.Map;

public class ClassMap {
    public static void show(){
        Map<String,Customer> map = new HashMap<>();
        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");

        map.put(c1.getEmail(),c1);
        map.put(c2.getEmail(),c2);

        for (var key : map.keySet()){
            System.out.println(key);
        }

        for (var customer : map.values()){
            System.out.println(customer);
        }

        for (var entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}