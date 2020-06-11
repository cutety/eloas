package com.cutety.eloas.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 * Created by cutety on 2020/5/28,21:17.
 **/
@SpringBootTest
class UserBehaviorRepositoryTest {
    @Autowired
    private UserBehaviorRepository userBehaviorRepository;
    @Test
    void findAll(){
        System.out.println(userBehaviorRepository.findAll());
    }
}