package com.khushi.generics;

public class Users implements Comparable<Users> {
    private int points;

    public Users(int points){
        this.points = points;
    }

    @Override
    public int compareTo(Users o){
        //this < o -> -1
        //this > o -> 1
        //this == o -> 0
        return points - o.points;
    }

    @Override
    public String toString(){
        return "Points = "+points;
    }
}
