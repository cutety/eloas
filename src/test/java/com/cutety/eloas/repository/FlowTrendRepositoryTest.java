package com.cutety.eloas.repository;

import com.cutety.eloas.entity.FlowTrend;
import com.cutety.eloas.entity.FlowTrendAvg;
import com.cutety.eloas.entity.FlowTrendByDay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:07.
 **/
@SpringBootTest
class FlowTrendRepositoryTest {
    @Autowired
    private FlowTrendRepository flowTrendRepository;
    @Test
    void findAll(){
        System.out.println(flowTrendRepository.findAll());
    }
    @Test
    void findByDate(){

    }

}