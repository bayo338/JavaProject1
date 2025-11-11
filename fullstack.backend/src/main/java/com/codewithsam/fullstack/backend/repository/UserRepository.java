package com.codewithsam.fullstack.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsam.fullstack.backend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
