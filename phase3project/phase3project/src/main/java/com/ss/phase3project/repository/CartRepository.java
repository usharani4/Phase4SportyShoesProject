package com.ss.phase3project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.phase3project.model.Cart;
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
