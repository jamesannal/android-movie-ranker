package example.codeclan.com.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 16/01/2017.
 */
public class MoviesTest {
    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Memento", "Thriller", 1);
    }

    @Test
    public void canGetMovieName() {
        assertEquals("Memento", movie.getName());
    }

    @Test
    public void canSetMovieName() {
        movie.setName("Dark City");
        assertEquals("Dark City", movie.getName());
    }

    @Test
    public void canGetMovieGenre() {
        assertEquals("Thriller", movie.getGenre());
    }

    @Test
    public void canSetMovieGenre() {
        movie.setGenre("Psychological Thriller");
        assertEquals("Psychological Thriller", movie.getGenre());
    }

    @Test
    public void canGetMovieRanking() {
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetMovieRanking() {
        movie.setRanking(2);
        assertEquals(2, movie.getRanking());
    }

    @Test
    public void canGetFullEntry(){
        assertEquals("Memento, the Thriller is at ranking 1.", movie.entry());
    }
}
