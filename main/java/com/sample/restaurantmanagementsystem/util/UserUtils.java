package com.sample.restaurantmanagementsystem.util;

import com.sample.restaurantmanagementsystem.service.UserService;
import com.sample.restaurantmanagementsystem.dto.UserDTO;
import com.sample.restaurantmanagementsystem.data.entity.user.Employee;

public class UserUtils {
    private UserUtils() {}

    public static UserDTO getUserData(UserService userService, String email) {
        Employee user = userService.getUserByEmail(email);

        UserDTO userData = userService.getUserFromEntity(user);

        return userData;
    }
}
