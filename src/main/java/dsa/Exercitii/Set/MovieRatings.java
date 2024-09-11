package dsa.Exercitii.Set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Movie implements Comparable<Movie>{
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.getRating(), o.getRating());
    }
}
public class MovieRatings {
    public static void main(String[] args) {
        SortedSet<Movie> movies = new TreeSet<>();
        movies.add(new Movie("Inception", 8.8));
        movies.add(new Movie("The Dark Night", 9.0));
        movies.add(new Movie("Pulp iction", 8.9));
        movies.add(new Movie("Interstellar", 8.6));
        movies.add(new Movie("The Godfather 1", 8.8));
        movies.add(new Movie("The Godfather 2", 8.8));

        System.out.println("Movies sorted:");
        for (Movie it : movies){
            System.out.println(it);
        }
    }
}
