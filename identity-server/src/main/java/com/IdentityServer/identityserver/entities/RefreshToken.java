package com.IdentityServer.identityserver.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "refresh_token")
public class RefreshToken {

    @Id
    private String refreshToken;

    private Instant expiry;
    private User user;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Instant getExpiry() {
        return expiry;
    }

    public void setExpiry(Instant expiry) {
        this.expiry = expiry;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RefreshToken() {
    }

    public RefreshToken(String refreshToken, Instant expiry, User user) {
        this.refreshToken = refreshToken;
        this.expiry = expiry;
        this.user = user;
    }

    @Override
    public String toString() {
        return "RefreshToken{" +
                "refreshToken='" + refreshToken + '\'' +
                ", expiry=" + expiry +
                ", user=" + user +
                '}';
    }
}
