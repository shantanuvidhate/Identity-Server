package com.IdentityServer.identityserver.services;

import com.IdentityServer.identityserver.Repositories.UserRepository;
import com.IdentityServer.identityserver.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
//    Return the store List
    public List<User> getUsers (){
        return this.userRepository.findAll();
    }

    public User createUser (User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
