package com.keydan.chamberoftrivia.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keydan.chamberoftrivia.Repository.UserRepository;
import com.keydan.chamberoftrivia.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
}
