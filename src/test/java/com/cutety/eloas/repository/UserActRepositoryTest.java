package com.cutety.eloas.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserActRepositoryTest {
    @Autowired
    private UserActRepository userActRepository;
    @Test
    void findByDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(userActRepository.getAllAtDate("2017-12-03"));
    }
    @Test
    void find(){
        System.out.println(userActRepository.getAllBetweenDates("2017-11-25","2017-12-02"));
    }
}