package com.IdentityServer.identityserver.services;

import com.IdentityServer.identityserver.Repositories.UserRepository;
import com.IdentityServer.identityserver.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
//    Return the store List
    public List<User> getUsers (){
        return this.userRepository.findAll();
    }

    public User createUser (User user){
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }
}
