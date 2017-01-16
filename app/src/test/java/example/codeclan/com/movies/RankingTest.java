package example.codeclan.com.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 16/01/2017.
 */
public class RankingTest {
    Rankings rankings;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;

    @Before
    public void before(){
        rankings = new Rankings();
        movie1 = new Movie("Memento", "Thriller", 1);
        movie2 = new Movie("Dark City", "Sci Fi", 2);
        movie3 = new Movie("Usual Suspects", "Thriller", 3);
        movie4 = new Movie("Naked Gun", "Comedy", 4);
    }


    @Test
    public void canGetMovieByIndexRank(){
        assertEquals("Naked Gun", rankings.getMovieIndex(4).getName());
    }

    @Test
    public void canReplaceLastMovie(){
        Movie replacement = new Movie("Moon", "Sci-Fi", 10);
        rankings.replaceLastMovie(replacement);
        assertEquals("Once Upon A Time In China", rankings.getMovieIndex(9).getName());
        assertEquals("Moon", rankings.getMovieIndex(10).getName());
    }

    @Test
    public void canGetMovieByName(){
        assertEquals("Battle Royale, the Sci Fi Thriller is at ranking 8.", rankings.titleSearch("Battle Royale").entry());
    }
    


}
