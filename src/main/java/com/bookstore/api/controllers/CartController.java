package com.bookstore.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.api.entities.dto.request.CartPostDto;
import com.bookstore.api.services.Abstract.CartService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/carts")
@RequiredArgsConstructor
public class CartController {
	
	private CartService cartService;
	
	
	@PostMapping
	public ResponseEntity<?> postBook(CartPostDto cartPostDto){
		var response = cartService.postBook(cartPostDto);
		return ResponseEntity.status(HttpStatus.OK)
							.body(response);
	}

}

