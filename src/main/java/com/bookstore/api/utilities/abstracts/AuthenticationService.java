package com.bookstore.api.utilities.abstracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.bookstore.api.entities.dto.AuthDto;
import com.bookstore.api.entities.dto.RefreshDto;
import com.bookstore.api.entities.dto.UserRequest;
import com.bookstore.api.entities.dto.UserRequestForRegister;

public interface AuthenticationService {
	AuthDto login(UserRequest loginRequest);
	ResponseEntity<AuthDto> register(UserRequestForRegister registerRequest);
	ResponseEntity<?> refresh(RefreshDto refreshRequest);
	ResponseEntity<?> getUsers();
}
