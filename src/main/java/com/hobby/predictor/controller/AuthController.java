package com.hobby.predictor.controller;

import com.hobby.predictor.dto.AuthRequestDTO;
import com.hobby.predictor.dto.AuthResponseDTO;
import com.hobby.predictor.dto.LoginRequest;
import com.hobby.predictor.model.User;
import com.hobby.predictor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("http://localhost:3000")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody AuthRequestDTO dto) {
        try {
            User savedUser = userService.registerUser(dto);
            return ResponseEntity.ok(new AuthResponseDTO("User registered successfully", savedUser.getId()));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new AuthResponseDTO(e.getMessage(), null));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequest dto) {
        try {
            User user = userService.login(dto.getEmail(), dto.getPassword());
            return ResponseEntity.ok(new AuthResponseDTO("Login successful", user.getId()));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new AuthResponseDTO(e.getMessage(), null));
        }
    }

}
