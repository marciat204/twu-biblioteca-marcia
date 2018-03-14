package com.twu.products.movie;

import com.twu.products.Item;

public class Movie  extends Item {

    private String director;
    private double rating;

    public Movie(String name, String director, int year, double rating) {
        super(name, year);
        this.director = director;
        this.rating = rating;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-20s %-8d %-2.2f", name, director, year, rating);
    }
}
