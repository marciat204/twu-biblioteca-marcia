package com.twu.products.movie;

import com.twu.products.Item;
import com.twu.products.ItemManager;

import java.util.ArrayList;
import java.util.List;

public class MovieManager extends ItemManager {

    public MovieManager(){
        super();
        allItens = generateMoviesMock();
    }

    private List<Item> generateMoviesMock() {
        List<Item> mockMovies = new ArrayList<>();
        Movie movie1 = new Movie("Hannah Montana The Movie", "Director 1", 2009, 9.5);
        Movie movie2 = new Movie("Beauty and the Beast", "Director 78", 2017, 7.5);
        Movie movie3 = new Movie("Blue Lagoon", "Director b", 1970, 5.5);

        mockMovies.add(movie1);
        mockMovies.add(movie2);
        mockMovies.add(movie3);
        return mockMovies;
    }

    @Override
    public String getHeader() {
        return String.format("%-30s %-20s %-8s %-4s\n", "Name", "Director", "Year", "Rating");
    }
}
