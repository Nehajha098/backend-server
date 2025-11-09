package com.hobby.predictor.service;

import com.hobby.predictor.model.UserResponse;
import com.hobby.predictor.repository.UserResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserResponseServiceImpl implements UserResponseService{

    @Autowired
    private UserResponseRepository repo;

    @Override
    public UserResponse saveUser(UserResponse user) {
        return repo.save(user);
    }
}
