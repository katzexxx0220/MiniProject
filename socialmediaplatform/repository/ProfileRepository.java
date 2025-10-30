package com.miniproject.socialmediaplatform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.miniproject.socialmediaplatform.model.Profile;

public interface ProfileRepository extends MongoRepository<Profile, String> {
    Profile findProfileByUsername(String username);
}
