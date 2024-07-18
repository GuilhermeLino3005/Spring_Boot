package com.example.demo.init;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.repository.UserReposity;

@Component
public class StartApplication implements CommandLineRunner{
     @Autowired
     private UserReposity reposity;

     @Transactional
     @Override
     public void run(String... args) throws Exception{
          User user = reposity.findByUsername("Guilherme");

          if(user == null){
               user = new User();
               user.setName("Guilherme");
               user.setUsername("Guilherme");
               user.setPassword("123456");
               user.getRoles().add("MANAGERS");
               reposity.save(user);
          }
          user = reposity.findByUsername("Gaby");
          if(user == null){
               user = new User();
               user.setName("Gaby");
               user.setPassword("Gaby");
               user.setPassword("flash");
               user.getRoles().add("USER");
               reposity.save(user);
          }    
     }
}
