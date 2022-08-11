package com.bookstore.api.entities.dto.request;

import com.bookstore.api.entities.dto.response.UserDto;

import lombok.Data;

@Data
public class UserDtoRequest extends UserDto {
	
	private String password;

}
