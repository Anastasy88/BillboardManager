package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieManagerTest {

    @Test
    public void addAMovie() {
        MovieManager manager = new MovieManager();

        manager.addAMovie("Film 1");
        manager.addAMovie("Film 2");
        manager.addAMovie("Film 3");
        manager.addAMovie("Film 4");
        manager.addAMovie("Film 5");
        manager.addAMovie("Film 6");
        manager.addAMovie("Film 7");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RecentMoviesInTheSpecifiedLimit() {
        MovieManager manager = new MovieManager();

        manager.addAMovie("Film 1");
        manager.addAMovie("Film 2");
        manager.addAMovie("Film 3");
        manager.addAMovie("Film 4");
        manager.addAMovie("Film 5");
        manager.addAMovie("Film 6");
        manager.addAMovie("Film 7");
        manager.addAMovie("Film 8");
        manager.addAMovie("Film 9");
        manager.addAMovie("Film 10");
        manager.addAMovie("Film 11");

        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RecentMoviesOverTheLimit() {
        MovieManager manager = new MovieManager(13);

        manager.addAMovie("Film 1");
        manager.addAMovie("Film 2");
        manager.addAMovie("Film 3");
        manager.addAMovie("Film 4");
        manager.addAMovie("Film 5");
        manager.addAMovie("Film 6");
        manager.addAMovie("Film 7");


        String[] expected = { "Film 7", "Film 6", "Film 5", "Film 4","Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFind() {
        MovieManager manager = new MovieManager();

        manager.addAMovie("Film 1");
        manager.addAMovie("Film 2");
        manager.addAMovie("Film 3");

        manager.findLast();

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
