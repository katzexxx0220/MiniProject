package com.miniproject.socialmediaplatform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.miniproject.socialmediaplatform.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {
     
}

