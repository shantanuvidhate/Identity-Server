package com.IdentityServer.identityserver.Repositories;

import com.IdentityServer.identityserver.entities.RefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RefreshTokenRepository extends MongoRepository <RefreshToken , String> {
}
