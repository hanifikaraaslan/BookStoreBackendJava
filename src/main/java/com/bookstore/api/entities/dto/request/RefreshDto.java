package com.bookstore.api.entities.dto.request;

import lombok.Data;

@Data
public class RefreshDto {
    private int userId;
    private String refreshToken;
}
