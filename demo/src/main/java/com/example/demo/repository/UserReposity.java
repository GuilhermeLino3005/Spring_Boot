package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

public interface UserReposity extends JpaRepository<User, Integer>{
     @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username = (: username)")
     public User findByUsername(@Param ("Username") String username);
     
}
