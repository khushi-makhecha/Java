package com.khushi;

import com.khushi.generics.GenericList;
import com.khushi.generics.Users;

public class Main {

    public static void main(String[] args) {
        var list = new GenericList<Users>();
        list.add(null);
        System.out.println(list.get(0));
    }
}
