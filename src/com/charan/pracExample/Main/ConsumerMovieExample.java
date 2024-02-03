package com.charan.pracExample.Main;

import com.charan.Model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMovieExample {
    public static void main(String[] args) {
        List<Movie> l=new ArrayList<>();
        populate(l);

        Consumer<Movie> c=m->{
            System.out.println("**************************************");
          System.out.println("Movie Name:"+m.getMovieName());
          System.out.println("Movie Hero:"+m.getMovieHero());
          System.out.println("Movie Heroine:"+m.getMovieHeroine());
          System.out.println("**************************************");
        };
        for(Movie m:l){
            c.accept(m);
        }
    }

    private static void populate(List<Movie> l) {
        l.add(new Movie("Bahubali","Prabhas","Anushka"));
        l.add(new Movie("Rayees","Sharukh","Sunny"));
        l.add(new Movie("Dangal","Ameer","Ritu"));
        l.add(new Movie("Sultan","Salman","Anushka"));
    }
}
