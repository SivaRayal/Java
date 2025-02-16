package main.com.ssk.javarefresher.features.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFeature {
    public static void main(String[] args) {
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("AVENGERS - INFINITY WAR",2018,8.4f, "Russo Brothers", "Robert Downey Jr | Chris Hemsworth | Mark Ruffalo", "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe."));
        movies.add(new Movie("AVENGERS - END GAME",2019,8.4f, "Russo Brothers", "Robert Downey Jr | Chris Hemsworth | Mark Ruffalo", "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe."));
        movies.add(new Movie("PULP FICTION",1994,9.4f, "Quentin Tarantino", "John TravoltaUma ThurmanSamuel L. Jackson", """
                The lives of two mob hitmen, a boxer, a gangster and his wife, and 
                a pair of diner bandits intertwine in four tales of violence and redemption.
                """));

        movies.stream().map(x->x.getName()).forEach(x-> System.out.println(x));
        List<Movie> filteredMovies = movies.stream().filter(predicate -> predicate.getDirector().equalsIgnoreCase("Russo Brothers")).collect(Collectors.toList());
        System.out.println(filteredMovies);

    }
}

class Movie{
    private String name;
    private int year;
    private float rating;
    private String director;
    private String casting;
    private String story;

    public Movie(String name, int year, float rating, String director, String casting, String story) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.director = director;
        this.casting = casting;
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCasting() {
        return casting;
    }

    public void setCasting(String casting) {
        this.casting = casting;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", director='" + director + '\'' +
                ", casting='" + casting + '\'' +
                ", story='" + story + '\'' +
                '}';
    }
}