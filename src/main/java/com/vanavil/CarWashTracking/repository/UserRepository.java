package com.vanavil.CarWashTracking.repository;

import com.vanavil.CarWashTracking.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
}
