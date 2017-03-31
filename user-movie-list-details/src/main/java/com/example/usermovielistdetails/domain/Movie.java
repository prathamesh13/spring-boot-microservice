package com.example.usermovielistdetails.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id @GeneratedValue
	private Long id;
	private String movieName;
	private String director;
	
	public Movie(){
		
	}
	
	public Movie(Long id, String movieName, String director) {
		this.id = id;
		this.movieName = movieName;
		this.director = director;
	}

	public Long getId() {
		return id;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getDirector() {
		return director;
	}
	
}
