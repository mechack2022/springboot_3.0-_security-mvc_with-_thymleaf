package com.fragile.mvc_with_security.repository;

import com.fragile.mvc_with_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findUserByEmail(String email);
}
