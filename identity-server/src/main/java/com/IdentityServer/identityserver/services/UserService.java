package com.IdentityServer.identityserver.services;

import com.IdentityServer.identityserver.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

//    Constructor
    public UserService (){
        store.add(new User(UUID.randomUUID().toString(),"Alice","Alice@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Bob","Bob@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Tom","Tom@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Jerry","Jerry@gmail.com"));
    }

//    Return the store List
    public List<User> getUsers (){
        return this.store;
    }

}
