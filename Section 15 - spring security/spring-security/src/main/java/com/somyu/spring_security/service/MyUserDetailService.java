package com.somyu.spring_security.service;

import com.somyu.spring_security.model.User;
import com.somyu.spring_security.model.UserPrinciple;
import com.somyu.spring_security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =repo.findByUsername(username);

        if(user == null){
            System.out.println("User not found 404");
            throw new UsernameNotFoundException("user not found 404");
        }
     return new UserPrinciple(user);
    }
}
