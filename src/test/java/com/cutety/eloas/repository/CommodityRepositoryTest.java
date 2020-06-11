package com.cutety.eloas.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CommodityRepositoryTest {
    @Autowired
    private CommodityRepository commodityRepository;
    @Test
    void find(){
        System.out.println(commodityRepository.findBuyTop("2017-12-03"));
    }

}