package com.miniproject.socialmediaplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.socialmediaplatform.model.*;
import com.miniproject.socialmediaplatform.repository.ProfileRepository;

@RestController
@RequestMapping()
public class ProfileController {

    @Autowired
    private ProfileRepository repo;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @GetMapping("/profile")
    public List<Profile> getAllProfile() {
        return repo.findAll();
    }

    @PostMapping("/profile")
    public Profile addProfile(@RequestBody Profile profile) {
       return repo.save(profile);
    }
    
    @GetMapping("/login")
    public LoginMessage login(@RequestBody Login login) {

        // find user profile
        Profile profile = repo.findProfileByUsername(login.getUsername());
        
        if (profile == null) {
            return new LoginMessage(false, "User not found");
        }
        
        // Check if password matches
        if (passwordEncoder.matches(login.getPassword(), profile.getPassword())) {
            return new LoginMessage(true, "Login Success");
        } else {
            return new LoginMessage(false, "Login Failed");
        }
    }
}

