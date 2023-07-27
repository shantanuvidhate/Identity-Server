package com.IdentityServer.identityserver.services;

import com.IdentityServer.identityserver.Repositories.RefreshTokenRepository;
import com.IdentityServer.identityserver.Repositories.UserRepository;
import com.IdentityServer.identityserver.entities.RefreshToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class RefreshTokenService {

    public long refreshTokenValidity = 5*60*60*1000;  // 5hrs

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    public RefreshToken createRefreshToken (String userName){
        RefreshToken refreshToken = RefreshToken.builder()
                .refreshToken(UUID.randomUUID().toString())
                .expiry(Instant.now().plusMillis(refreshTokenValidity))
                .user(userRepository.findByUsername(userName).get())
                .build();

        refreshTokenRepository.save(refreshToken);
        return refreshToken;
    }

    public RefreshToken verifyRefreshToken(String refreshToken) {
        RefreshToken refreshTokenOb = refreshTokenRepository.findById(refreshToken).orElseThrow(() -> new RuntimeException("Token does not exist"));
        if (refreshTokenOb.getExpiry().compareTo(Instant.now()) < 0){
            throw new RuntimeException("Refresh token Expired!!");
        }
        return refreshTokenOb;
    }

}
