package com.example.oauthdemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringSecurity {
    //    @Bean
//    public SecurityFilterChain filteringCriteria(HttpSecurity http) throws Exception {
//       http.cors().disable();
//       http.csrf().disable();
//         http.authorizeHttpRequests(auth-> auth.anyRequest().permitAll());
//        return http.build();
//    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
