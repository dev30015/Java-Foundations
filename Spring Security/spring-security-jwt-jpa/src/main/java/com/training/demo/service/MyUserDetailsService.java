package com.training.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.demo.dao.UserRespository;
import com.training.demo.entity.User;
import com.training.demo.model.UserPrincipal;

import java.util.ArrayList;

import javax.annotation.Resource;

@Service
@Qualifier("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
    private UserRespository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        //System.out.println("Loaded user "+user);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserPrincipal(user);
	}

}