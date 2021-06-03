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
        System.out.println(map);                            // -----(1)

//        var customer1 = map.get("e1");
//        System.out.println(customer1);
//        var customer2 = map.get("e10");                Trying this gives "null" as the output
//        System.out.println(customer2);

        var unknown = new Customer("Unknown","");       //This is done to avoid NullPointerException
        var customer = map.getOrDefault("e10",unknown);
        System.out.println(customer);
        var exists = map.containsKey("e10");
        System.out.println(exists);

        map.replace("e1",new Customer("ab","e1"));     //Replaced (1)
        System.out.println(map);
    }
}
