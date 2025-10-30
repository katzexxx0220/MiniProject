package com.miniproject.socialmediaplatform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.miniproject.socialmediaplatform.model.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {
}

