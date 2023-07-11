package com.IdentityServer.identityserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController             // for REST API endpoints
@RequestMapping("/home")
public class Home {

    @GetMapping ("/users")
    public String getUsers (){
        System.out.println("Getting users");
        return "Users";
    }


}
