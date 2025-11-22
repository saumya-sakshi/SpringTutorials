package com.somyu.spring_security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //lambda approach
        /** To diable CSRF token**/
        http.csrf(custom->custom.disable());
        /** To Authorize all the requests**/
        http.authorizeHttpRequests(request-> request.anyRequest().authenticated());
        /** To Have login form**/
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        /** To make it STATELESS**/
        http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

       return http.build();
    }
}
