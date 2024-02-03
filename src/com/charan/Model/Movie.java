package com.charan.Model;

public class Movie {
    public String movieName;
    public String movieHero;
    public String movieHeroine;

    public Movie(String movieName, String movieHero, String movieHeroine) {
        this.movieName = movieName;
        this.movieHero = movieHero;
        this.movieHeroine = movieHeroine;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieHero() {
        return movieHero;
    }

    public void setMovieHero(String movieHero) {
        this.movieHero = movieHero;
    }

    public String getMovieHeroine() {
        return movieHeroine;
    }

    public void setMovieHeroine(String movieHeroine) {
        this.movieHeroine = movieHeroine;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieHero='" + movieHero + '\'' +
                ", movieHeroine='" + movieHeroine + '\'' +
                '}';
    }
}
