package com.bookstore.api.entities.dto;

import lombok.Data;

@Data
public class UserRequestForRegister {
	
	private int roleId;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}
