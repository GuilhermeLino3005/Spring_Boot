package com.example.demo.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserReposity;

@Service
public class SecurityDatabaseService implements UserDetailsService{
     @Autowired
     private UserReposity userReposity;

     @Override
     public UserDetails loadUserByUsername (String username){
          User userEntity = userReposity.findByUsername(username);

          if(userEntity == null){
               throw new UsernameNotFoundException(username);
          }
          Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
          userEntity.getRoles().forEach(role -> {
               authorities.add(new SimpleGrantedAuthority("ROLE " +role));
          });
          
          UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getUsername(),
               userEntity.getPassword(),
               authorities);
          
          return user;
     }

}
