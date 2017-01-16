package example.codeclan.com.movies;

/**
 * Created by user on 16/01/2017.
 */
public class Rankings {
    private Movie[] movies;

    public Rankings(){
        movies = new Movie[10];
        addMovie(new Movie("Memento", "Thriller", 1));
        addMovie(new Movie("Dark City", "Sci Fi", 2));
        addMovie(new Movie("Usual Suspects", "Thriller", 3));
        addMovie(new Movie("Naked Gun", "Comedy", 4));
        addMovie(new Movie("Guardians of the Galaxy", "Superhero", 5));
        addMovie(new Movie("Deadpool", "Superhero", 6));
        addMovie(new Movie("Last Night", "Apocalyptic Sci Fi", 7));
        addMovie(new Movie("Battle Royale", "Sci Fi Thriller", 8));
        addMovie(new Movie("Once Upon A Time In China", "Historical Epic With Ass Kicking", 9));
        addMovie(new Movie("M", "Film Noir", 10));
    }

    public int movieCount() {
        int count = 0;
        for(int i = 0; i < movies.length; i++){
            if(movies[i] !=null){count+=1;}
        }
        return count;
    }

    public void addMovie(Movie movie) {
        if (movieCount() == 10) {return;}
        movies[movie.getRanking() - 1] = movie;

    }

    public Movie getMovieIndex(int ranking) {
        return movies[ranking- 1];
    }

    public void replaceLastMovie(Movie replacement) {
        movies[9] = replacement;
    }

    public Movie titleSearch(String name) {
        Movie searchedMovie;

        for(Movie movie : movies){
            if(movie.getName() == name){
                searchedMovie = movie;
                return searchedMovie;
            }
        }
        return null;
    }
}
