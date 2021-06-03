package com.khushi;

import com.khushi.generics.GenericsList;
import com.khushi.generics.Instructor;
import com.khushi.generics.Users;
import com.khushi.generics.Utils;

public class Main {

    public static void main(String[] args) {
        Users user = new Instructor(10);
        System.out.println(user.print());
        Utils.printUser1(new Instructor(10));
        var user2 = new GenericsList<Instructor>();             //shows error. Hence, proved that inheritance
        Utils.printUser2(user2);                               //fails in generics
    }
}
