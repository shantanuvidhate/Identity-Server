package com.IdentityServer.identityserver.controllers;

import com.IdentityServer.identityserver.models.User;
import com.IdentityServer.identityserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController             // for REST API endpoints
@RequestMapping("/home")
public class Home {

    @Autowired                      // Autowiring create object at runtime
    private UserService userService;

    @GetMapping ("/users")
    public List<User> getUsers (){
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser (Principal principal){
        return principal.getName();
    }


}
