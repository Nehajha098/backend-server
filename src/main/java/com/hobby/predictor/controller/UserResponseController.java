package com.hobby.predictor.controller;

import com.hobby.predictor.model.UserResponse;
import com.hobby.predictor.service.UserResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000") // allow React
public class UserResponseController {

    @Autowired
    private UserResponseService service;

    @PostMapping("/submit")
    public UserResponse formSubmit(@RequestBody UserResponse user) {
        return service.saveUser(user);
    }
}
