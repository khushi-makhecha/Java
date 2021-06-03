package com.khushi.generics;

public class UserList {
    private Users[] items = new Users[10];
    private int count = 0;

    public void add(Users user){
        items[count++] = user;
    }

    public Users get(int index){
        return items[index];
    }
}