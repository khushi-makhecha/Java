package com.khushi;

import com.khushi.generics.List;
import com.khushi.generics.Users;

public class Main {

    public static void main(String[] args) {
        var list = new List();
        list.add(Integer.valueOf(1));            //this is boxing which occurs by default; shows list.add(1);
        list.add(String.valueOf(1));             //can be written as list.add("1") also
        list.add(new Users());

        int n = (int) list.get(0);
        System.out.println(n);
        int x = (int) list.get(1);
        System.out.println(x);
    }
}