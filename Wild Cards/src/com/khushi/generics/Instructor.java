package com.khushi.generics;

public class Instructor extends Users{

    public Instructor(int points) {
        super(points);
    }

    public String print(){
        return "Instructor";
    }
}