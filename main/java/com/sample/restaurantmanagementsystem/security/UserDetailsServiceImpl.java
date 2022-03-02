package com.sample.restaurantmanagementsystem.security;

import com.sample.restaurantmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import com.sample.restaurantmanagementsystem.data.entity.user.Employee;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // work with email
        Employee empUser = userService.getUserByEmail(email);

        if(empUser == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new CustomUserDetails(empUser);
    }
}
