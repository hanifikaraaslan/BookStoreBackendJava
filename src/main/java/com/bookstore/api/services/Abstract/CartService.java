package com.bookstore.api.services.Abstract;

import com.bookstore.api.entities.Cart;
import com.bookstore.api.entities.dto.request.CartPostDto;
import com.bookstore.api.entities.models.ApiResponse;

public interface CartService {
  
	ApiResponse<Cart> postBook(CartPostDto cartPostDto);
	
}