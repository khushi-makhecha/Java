package com.khushi.stream;

public class Movies {
    private String title;
    private int likes;
    private Category category;

    public Movies(String title, int likes, Category category) {
        this.title = title;
        this.likes = likes;
        this.category = category;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return title;
    }
}
