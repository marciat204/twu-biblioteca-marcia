package com.twu.movie;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class MovieManager {

    private List<Movie> allMovies;

    public MovieManager(){
        allMovies = generateMoviesMock();
    }

    private List<Movie> generateMoviesMock() {
        List<Movie> mockMovies = new ArrayList<>();
        Movie movie1 = new Movie("Hannah Montana The Movie", "Director 1", 2009, 9.5);
        Movie movie2 = new Movie("Beauty and the Beast", "Director 78", 2017, 7.5);
        Movie movie3 = new Movie("Blue Lagoon", "Director b", 1970, 5.5);

        mockMovies.add(movie1);
        mockMovies.add(movie2);
        mockMovies.add(movie3);
        return mockMovies;
    }

    public String getAvailableMoviesDetailsList() {
        List<Movie> availableMovies = allMovies.stream().filter(movie -> movie.isAvailable()).collect(Collectors.toList());
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add(String.format("%-30s %-20s %-8s %-4s\n", "Name", "Director", "Year", "Rating"));

        for (Movie movie: availableMovies) {
            stringJoiner.add(movie.toString());
        }
        return stringJoiner.toString();
    }

}
