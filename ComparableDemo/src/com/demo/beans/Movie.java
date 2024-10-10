package com.demo.beans;

import com.demo.dao.MovieDao;

public class Movie implements Comparable<Movie>{
	public String mname;
	public double rating;
	private int year;
	private MovieDao moviedao;
	
	public Movie() {
		super();
		moviedao=new MovieDao();
	}
	public Movie(String mname, double rating, int year) {
		super();
		this.mname = mname;
		this.rating = rating;
		this.year = year;
	}
	public String getMname() {
		return mname;
	}

	public double getRating() {
		return rating;
	}
	
	public int getYear() {
		return year;
	}
	@Override
	public int compareTo(Movie o) {
		return this.year-o.year;
		
	}
}
