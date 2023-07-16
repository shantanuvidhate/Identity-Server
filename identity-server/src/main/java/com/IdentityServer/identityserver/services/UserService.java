package com.IdentityServer.identityserver.services;

import com.IdentityServer.identityserver.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

//    Return the store List
    public List<User> getUsers (){
        return this.store;
    }

}
