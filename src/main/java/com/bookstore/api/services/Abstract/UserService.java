package com.bookstore.api.services.Abstract;

import java.util.List;

import com.bookstore.api.entities.User;
import com.bookstore.api.entities.dto.request.UserDtoRequest;
import com.bookstore.api.entities.dto.request.UserRequestForRegister;
import com.bookstore.api.entities.dto.response.UserDto;
import com.bookstore.api.entities.models.ApiResponse;

public interface UserService extends ApplicationUserDao {

    ApiResponse<List<UserDto>> getAllUsers();

    ApiResponse<UserDto> getOneUser(int id);

    ApiResponse<UserDto> postOneUser(UserRequestForRegister userDtoRequest);

    ApiResponse<UserDto> putOneUser(int id, UserDtoRequest userDtoRequest);

    User getOneUserByUserName(String username);

    void deleteOneUser(int id);

    User saveOneUser(User user);
}
