package com.vanavil.CarWashTracking.service;

import com.vanavil.CarWashTracking.model.User;
import com.vanavil.CarWashTracking.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
