package com.keydan.chamberoftrivia.Service.Impl;

import com.keydan.chamberoftrivia.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
}
