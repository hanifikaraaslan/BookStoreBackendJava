package com.bookstore.api.entities.dto.response;

import java.util.Set;

import com.bookstore.api.entities.Role;

import lombok.Data;

@Data
public class UserDto {
    private String userName;
    private String firstName;
    private String lastName;
    private int roleId;
}
