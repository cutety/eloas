package com.cutety.eloas.controller;

import com.cutety.eloas.entity.UserRetained;
import com.cutety.eloas.repository.UserRetainedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRetained")
public class UserRetainedHandler {
    @Autowired
    private UserRetainedRepository userRetainedRepository;
    @GetMapping("/findAll")
    public List<UserRetained> findAll(){
        return userRetainedRepository.findAll();
    }
}
