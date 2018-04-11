package com.hellokoding.springboot.service;

import com.hellokoding.springboot.domain.User;


public interface UserService {

    User findUserByName(String username);
}