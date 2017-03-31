package com.example.usermovielistdetails.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserProfile {
	
	@Id @GeneratedValue
	private Long id;	
	private String username;
	
	@OneToMany
	private List<Movie> watchlist;
	
	@OneToMany
	private List<Movie> recommendedList;
	
	public UserProfile(){
		
	}
	
	public UserProfile(Long id, String username, List<Movie> watchlist, List<Movie> recommendedList) {
		this.id = id;
		this.username = username;
		this.watchlist = watchlist;
		this.recommendedList = recommendedList;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public List<Movie> getWatchlist() {
		return watchlist;
	}

	public List<Movie> getRecommendedList() {
		return recommendedList;
	}
	
}
