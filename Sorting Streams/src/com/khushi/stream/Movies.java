package com.khushi.stream;

public class Movies implements Comparable{
    private String title;
    private int likes;

    public Movies(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
