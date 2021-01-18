package com.andresimiquelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresimiquelli.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
