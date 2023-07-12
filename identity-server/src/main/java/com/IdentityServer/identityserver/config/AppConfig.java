package com.IdentityServer.identityserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService (){
        UserDetails user1 = User.builder().username("Alice").password(passwordEncoder().encode("alice@123")).roles("System ADMIN").build();
        UserDetails user2 = User.builder().username("Bob").password(passwordEncoder().encode("bob@123")).roles("Database ADMIN").build();
        UserDetails user3 = User.builder().username("Tom").password(passwordEncoder().encode("tom@123")).roles("HR").build();
        UserDetails user4 = User.builder().username("Jerry").password(passwordEncoder().encode("jerry@123")).roles("CEO").build();
        return new InMemoryUserDetailsManager(user1,user2,user3,user4);
    }


//    For password encryption using BCryptPasswordEncoder
    @Bean
    public PasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }
}
