package com.project.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto user);
}
