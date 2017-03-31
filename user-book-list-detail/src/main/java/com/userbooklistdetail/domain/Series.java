package com.userbooklistdetail.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Series {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;

	public Series(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Series(){
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
