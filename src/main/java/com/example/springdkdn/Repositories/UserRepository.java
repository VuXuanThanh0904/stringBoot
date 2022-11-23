package com.example.springdkdn.Repositories;

import com.example.springdkdn.Domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}