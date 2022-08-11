package com.bookstore.api.entities.dto.request;

import com.bookstore.api.entities.Book;
import com.bookstore.api.entities.User;

import lombok.Data;

@Data
public class CartPostDto {

	private int id;
	private int bookId;
	private int userId;
}
