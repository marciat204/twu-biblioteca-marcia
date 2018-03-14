package com.twu.products.movie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieManagerTest {

    MovieManager movieManager;

    @Before
    public void setUp(){
        movieManager = new MovieManager();
    }

    @Test
    public void ShouldShowAllAvailableMoviesDetails(){
        String expectedMovieListDetails =
                String.format("%-30s %-20s %-8s %-4s\n\n", "Name", "Director", "Year", "Rating") +
                String.format("%-30s %-20s %-8s %-2.2f\n", "Hannah Montana The Movie", "Director 1", "2009", 9.5) +
                String.format("%-30s %-20s %-8s %-2.2f\n", "Beauty and the Beast", "Director 78", "2017", 7.5) +
                String.format("%-30s %-20s %-8s %-2.2f", "Blue Lagoon", "Director b", "1970", 5.5);

        String actualMovieListDetails = movieManager.getAvailableMoviesDetailsList();

        assertEquals(expectedMovieListDetails, actualMovieListDetails);
    }
}
