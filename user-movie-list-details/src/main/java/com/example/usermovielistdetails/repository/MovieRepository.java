package com.example.usermovielistdetails.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.usermovielistdetails.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{

}
