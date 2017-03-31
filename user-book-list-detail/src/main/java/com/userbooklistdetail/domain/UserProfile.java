package com.userbooklistdetail.domain;

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
	private List<Series> watchlist;
	
	public UserProfile(Long id, String username, List<Series> watchlist) {
		this.id = id;
		this.username = username;
		this.watchlist = watchlist;
	}
		
	public UserProfile() {
		
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public List<Series> getWatchlist() {
		return watchlist;
	}
	
	
	


}
