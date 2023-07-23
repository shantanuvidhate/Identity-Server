package com.IdentityServer.identityserver.services;

import com.IdentityServer.identityserver.Repositories.RefreshTokenRepository;
import com.IdentityServer.identityserver.entities.RefreshToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class RefreshTokenService {

    public long refreshTokenValidity = 5*60*60*1000;



    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    public RefreshToken createRefreshToken (String userName){
        RefreshToken refreshToken = RefreshToken.builder()
                .refreshToken(UUID.randomUUID().toString())
                .expiry(Instant.now().plusMillis(refreshTokenValidity))
//                .user()
                .build();  // 5hrs
        return refreshToken;
    }

   public boolean verifyRefreshToken (String refreshToken){
        return false;
   }

}
