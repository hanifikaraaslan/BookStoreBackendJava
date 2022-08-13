
package com.bookstore.api.services.concretes;

import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.bookstore.api.entities.Book;
import com.bookstore.api.entities.Cart;
import com.bookstore.api.entities.User;
import com.bookstore.api.entities.dto.request.CartPostDto;
import com.bookstore.api.entities.dto.response.UserDto;
import com.bookstore.api.entities.models.ApiResponse;
import com.bookstore.api.repositories.CartRepository;
import com.bookstore.api.repositories.UserRepository;
import com.bookstore.api.services.Abstract.BookService;
import com.bookstore.api.services.Abstract.CartService;
import com.bookstore.api.services.Abstract.UserService;

import lombok.RequiredArgsConstructor;

@Service
public class CartServiceImp implements CartService {
 
	private UserService userService;
	private CartRepository cartRepository;
	private BookService bookService;
	private ModelMapper mapper;
	


	@Override
	public ApiResponse<Cart> postBook(CartPostDto cartPostDto) {
		Book book=bookService.getOneBook(cartPostDto.getBookId()).getData();
		UserDto userDto= userService.getOneUser(cartPostDto.getUserId()).getData();
		Cart cart= cartRepository.getById(cartPostDto.getId());
	  User user  = mapper.map(userDto, User.class);
	  Set<Book> bookUpdate= cart.getBooks();
	  bookUpdate.add(book);
	  cart.setBooks(bookUpdate);
	  cartRepository.save(cart);
		return ApiResponse.default_OK(cart);
	}



	@Override
	public void createCart(Cart cart) {
		cartRepository.save(cart);
	}
	
	

}
