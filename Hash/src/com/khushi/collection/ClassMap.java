package com.khushi.collection;

import java.util.ArrayList;
import java.util.List;

public class ClassMap {
    public static void show(){
        //Java : Map (Same as Python Dictionary)
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a","e1"));
        for(var customer : customers)
            if(customer.getEmail() == "e1")
                System.out.println("Found!");
    }
}