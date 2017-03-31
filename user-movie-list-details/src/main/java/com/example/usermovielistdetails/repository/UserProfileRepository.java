package com.example.usermovielistdetails.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.usermovielistdetails.domain.UserProfile;

public interface UserProfileRepository extends CrudRepository<UserProfile, Long>{

}
