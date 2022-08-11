package com.bookstore.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.api.entities.User;
import com.bookstore.api.entities.dto.request.UserDtoRequest;
import com.bookstore.api.entities.dto.response.UserDto;
import com.bookstore.api.repositories.UserRepository;
import com.bookstore.api.services.Abstract.ApplicationUserDao;
import com.bookstore.api.services.Abstract.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService; // UserServiceImp

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        var response = userService.getAllUsers();
        return ResponseEntity
                .status(response.getHttpStatus())
                .body(response);
    }

    @PostMapping
    public ResponseEntity<?> postOneUser(@RequestBody UserDtoRequest userDtoRequest) {
        var response = userService.postOneUser(userDtoRequest);
        return ResponseEntity
                .status(response.getHttpStatus())
                .body(response);
    }
    
   @PutMapping(path = "/{id}")
   @PreAuthorize("hasAuthority('user:put')")
    public ResponseEntity<?> putOneUser(@RequestBody User user, @PathVariable(name = "id", required = true) int id){
	   var response=userService.putOneUser(id, user);
    	return ResponseEntity
    			.status(response.getHttpStatus())
    			.body(response);
    }
   
   @DeleteMapping(path="/{id}")
   @PreAuthorize("hasAuthority('user:delete')")
   public ResponseEntity<?> deleteOneUser(@PathVariable(name ="id", required = true) int id){
	  userService.deleteOneUser(id);
	  return ResponseEntity
			  .status(HttpStatus.OK)
			  .body("User deleted");
			  }
   
}
