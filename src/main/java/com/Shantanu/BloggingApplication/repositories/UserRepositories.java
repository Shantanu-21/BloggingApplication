package com.Shantanu.BloggingApplication.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.Shantanu.BloggingApplication.entity.UserEntity;

@Service
public interface UserRepositories extends JpaRepository<UserEntity, Serializable> {

}
