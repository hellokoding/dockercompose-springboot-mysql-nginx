package com.hellokoding.springboot.service.impl;

import com.hellokoding.springboot.repository.UserRepository;
import com.hellokoding.springboot.domain.User;
import com.hellokoding.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepository;

    public User findUserByName(String username) {
        return UserRepository.findByUsername(username);
    }

}