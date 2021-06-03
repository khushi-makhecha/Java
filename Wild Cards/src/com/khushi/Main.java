package com.khushi;

import com.khushi.generics.GenericsList;
import com.khushi.generics.Instructor;
import com.khushi.generics.Users;
import com.khushi.generics.Utils;

import java.security.Key;

public class Main {

    public static void main(String[] args) {
//        Users user = new Instructor(10);
//        System.out.println(user.print());
//        Utils.print(new Instructor(10));
//        var user2 = new GenericsList<Instructor>();
//        Utils.printUser(user2);

        Utils.print(new GenericsList<Instructor>());
        Utils.printUser(new Instructor(10));
    }
}