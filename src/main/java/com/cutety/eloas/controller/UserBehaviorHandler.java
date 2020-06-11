package com.cutety.eloas.controller;

import com.cutety.eloas.entity.UserBehavior;
import com.cutety.eloas.repository.UserBehaviorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,21:18.
 **/
@RestController
@RequestMapping("/userBehavior")
public class UserBehaviorHandler {
    @Autowired
    private UserBehaviorRepository userBehaviorRepository;
    @GetMapping("/findAll")
    public List<UserBehavior> findAll(){
        return userBehaviorRepository.findAll();
    }

}
