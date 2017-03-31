package com.userbooklistdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userbooklistdetail.domain.UserProfile;
import com.userbooklistdetail.repository.UserProfileRepository;



@RestController
@RequestMapping("/userprofiles")
public class UserProfileController {
	

	@Autowired
	private UserProfileRepository userProfileRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<UserProfile> getUserProfiles(){
		List<UserProfile> userProfiles =  (List<UserProfile>) userProfileRepository.findAll();
		return userProfiles;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserProfile getUserProfile(@PathVariable("id") Long id){
		UserProfile userProfile = userProfileRepository.findOne(id);
		return userProfile;
	}


}
