package com.cutety.eloas.controller;

import com.cutety.eloas.entity.UserValue;
import com.cutety.eloas.repository.UserValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userValue")
public class UserValueHandler {
    @Autowired
    private UserValueRepository userValueRepository;
    @GetMapping("/get")
    public UserValue getUserValue(){
       return userValueRepository.findAll().get(0);
    }
}
