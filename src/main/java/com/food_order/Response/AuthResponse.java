package com.food_order.Response;

import com.food_order.Model.User_Role;
import lombok.Data;

@Data
public class AuthResponse {
    private  String jwt;
    private String message;
    private User_Role role;
}
