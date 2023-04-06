package day09.movieProgram;

import day04.array.StringList;

public class Actor {
    // 우리 배우의 이름은 하나이고 작품은 많음

    private String name;
    private StringList movies;

    public Actor() {
    }

    public Actor(String name, StringList movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringList getMovies() {
        return movies;
    }

    public void setMovies(StringList movies) {
        this.movies = movies;
    }
}
