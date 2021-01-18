package com.andresimiquelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresimiquelli.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
