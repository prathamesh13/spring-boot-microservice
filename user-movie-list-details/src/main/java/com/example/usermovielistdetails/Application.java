package com.example.usermovielistdetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.usermovielistdetails.domain.Movie;
import com.example.usermovielistdetails.domain.UserProfile;
import com.example.usermovielistdetails.repository.MovieRepository;
import com.example.usermovielistdetails.repository.UserProfileRepository;

@SpringBootApplication
public class Application {
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Autowired 
	private MovieRepository movieRepository;
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
	
	@Bean
	public CommandLineRunner initializeStore(){
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Movie movie1 = new Movie(1L, "The Departed", "Martin Scorsese");
				Movie movie2 = new Movie(2L, "The Usual Suspects", "Bryan Singer");
				List<Movie> movies = new ArrayList<>();
				movies.add(movie1);
				movies.add(movie2);
				
				movieRepository.save(movie1);
				movieRepository.save(movie2);
				
				UserProfile user1 = new UserProfile(101L, "Prathamesh", movies, movies);
				userProfileRepository.save(user1);
				
				System.out.println("saved");
				
			}
		};
	}

}
