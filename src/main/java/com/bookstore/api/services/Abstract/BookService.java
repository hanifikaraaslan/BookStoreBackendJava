package com.bookstore.api.services.Abstract;

import com.bookstore.api.entities.Book;
import com.bookstore.api.entities.dto.request.BookDtoForPost;
import com.bookstore.api.entities.dto.request.BookDtoForPut;
import com.bookstore.api.entities.models.ApiResponse;

import java.util.List;

public interface BookService {
    ApiResponse<List<Book>> getAllBook();

    ApiResponse<Book> getOneBook(int id);

    // id, title, categoryId
    ApiResponse<Book> postOneBook(BookDtoForPost bookForPost);

    ApiResponse<Book> putOneBook(int id, BookDtoForPut book);

    List<Book> getByBookNameContains (String productName);

    void deleteOneBook(int id);
}
