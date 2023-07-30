package com.IdentityServer.identityserver.models;

import lombok.Builder;

@Builder
public class JwtResponse {
    private String jwtToken;

    private String username;

    private String refreshToken;

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public JwtResponse() {
    }

    public JwtResponse(String jwtToken, String username , String refreshToken) {
        this.jwtToken = jwtToken;
        this.username = username;
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "JwtResponse{" +
                "jwtToken='" + jwtToken + '\'' +
                ", username='" + username + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
