package com.cutety.eloas.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserActResultRepositoryTest {
@Autowired
    private UserActResultRepository userActResultRepository;
    @Test
    void findByDate() {
        System.out.println(userActResultRepository.getAllBetweenDates("2017-11-25","2017-11-25"));
    }
}