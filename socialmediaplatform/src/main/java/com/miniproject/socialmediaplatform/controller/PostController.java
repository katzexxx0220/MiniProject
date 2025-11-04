package com.miniproject.socialmediaplatform.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.miniproject.socialmediaplatform.model.Post;
import com.miniproject.socialmediaplatform.repository.PostRepository;

import java.util.List;

@RestController
@RequestMapping()
public class PostController{

    @Autowired
    PostRepository repo;

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
       return repo.save(post);
    }

    @GetMapping("/post")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }
}