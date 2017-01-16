package example.codeclan.com.movies;

/**
 * Created by user on 16/01/2017.
 */
public class Movie {
    private String name;
    private String genre;
    private int ranking;

    public Movie(String name, String genre, int ranking) {
        this.name = name;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


    public String entry() {
        return name + ", the " + genre + " is at ranking " + ranking + ".";
    }
}
