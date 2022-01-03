package com.example.registrationloginsystem.service;

import com.example.registrationloginsystem.entity.User;
import com.example.registrationloginsystem.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
