package com.userbooklistdetail;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.userbooklistdetail.domain.Series;
import com.userbooklistdetail.domain.UserProfile;
import com.userbooklistdetail.repository.SeriesRepository;
import com.userbooklistdetail.repository.UserProfileRepository;

@SpringBootApplication
public class Application {


	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Autowired
	private SeriesRepository seriesRepository;
	
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner initializeStore(){
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Series Series1 = new Series(1L, "Doctor Who");
				Series Series2 = new Series(2L, "The Big Bang Theory");
				List<Series> SeriesList = new ArrayList<>();
				SeriesList.add(Series1);
				SeriesList.add(Series2);
				
				seriesRepository.save(Series1);
				seriesRepository.save(Series2);
			
				UserProfile user1 = new UserProfile(101L, "Prathamesh", SeriesList);
				userProfileRepository.save(user1);
			
				
			}
		};
	}
}
