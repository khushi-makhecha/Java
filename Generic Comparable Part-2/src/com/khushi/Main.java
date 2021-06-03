package com.khushi;

import com.khushi.generics.Users;
import com.khushi.generics.Utils;

public class Main {

    public static void main(String[] args) {
        var user1 = new Users(10);
        var user2 = new Users(20);
        if(user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if(user1.compareTo(user2) == 0)
            System.out.println("user1 = user2");
        else
            System.out.println("user1 > user2");

        System.out.println(Utils.max(1,2));
        System.out.println(Utils.max(new Users(10), new Users(20)));
        Utils.print(1,"abc");
    }
}
