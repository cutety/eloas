package com.cutety.eloas.repository;

import org.hibernate.query.NativeQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BehaviorConversionRepositoryTest {
    @Autowired
    private BehaviorConversionRepository behaviorConversionRepository;
    @Autowired
    private BehaviorRepository behaviorRepository;
    @Test
    void findAll(){
        System.out.println(behaviorConversionRepository.findAll());
    }
    @Test
    void  findByPage(){
        PageRequest pageRequest = PageRequest.of(0,7);
        System.out.println(behaviorConversionRepository.findAll(pageRequest).getContent());
    }

    @Test
    void findByDate(){
        System.out.println(behaviorRepository.findByDate("2017-12-01","2017-12-02"));
    }
}