package com.IdentityServer.identityserver.Repositories;

import com.IdentityServer.identityserver.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User ,String> {

    public Optional<User> findByUsername (String username);
}
