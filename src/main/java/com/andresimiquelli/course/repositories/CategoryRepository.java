package com.andresimiquelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresimiquelli.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
