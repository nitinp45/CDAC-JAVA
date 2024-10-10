package com.demo.dao;


import java.util.ArrayList;

import com.demo.beans.Movie;

public class MovieDao {
	static ArrayList<Movie> mlist;
	
	static {
		mlist=new ArrayList<>();
		mlist.add(new Movie("Force Awakens", 8.3, 2015));
	    mlist.add(new Movie("Star Wars", 8.7, 1977));
	    mlist.add(new Movie("Empire Strikes Back", 8.8, 1980));
	    mlist.add(new Movie("Return of the Jedi", 8.4, 1983));
		
	}

	

	public static ArrayList<Movie> getMovies() {
		// TODO Auto-generated method stub
		return mlist;
	}
	

}
