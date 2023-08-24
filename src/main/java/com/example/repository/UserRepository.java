package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.UserEntity;

public interface  UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByUsername(String username);

}
