package com.demo.testClass;

import java.util.ArrayList;

import java.util.Collections;

import com.demo.beans.Movie;
import com.demo.dao.MovieDao;

public class TestMainClass {

	public static void main(String[] args) {

		ArrayList<Movie> list = MovieDao.getMovies();
		Collections.sort(list);
		System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getMname() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
		
		
	}

}
