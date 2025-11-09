package com.hobby.predictor.service;

import com.hobby.predictor.dto.AuthRequestDTO;
import com.hobby.predictor.model.User;

public interface UserService {
    User registerUser(AuthRequestDTO dto);
    User login(String email, String password);
}
