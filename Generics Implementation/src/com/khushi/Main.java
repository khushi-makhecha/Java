package com.khushi;

import com.khushi.generics.GenericsList;
import com.khushi.generics.Users;

public class Main {

    public static void main(String[] args) {
        var list1 = new GenericsList<Integer>();                 //new GenericsList <Integer>().add(1); can
        list1.add(1);                                            //also be used
        System.out.println(list1.get(0));

        var list2 = new GenericsList<Users>();                   //new GenericsList <Integer> ().add(1); can
        list2.add(new Users());
        System.out.println(list2.get(0));

        var list3 = new GenericsList<String>();
        list3.add("K");
        System.out.println(list3.get(0));
    }
}