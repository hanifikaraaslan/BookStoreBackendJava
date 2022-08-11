package com.bookstore.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.api.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
