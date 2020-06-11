package com.cutety.eloas.repository;

import com.cutety.eloas.entity.FlowTrendAvg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlowTrendAvgRepositoryTest {
    @Autowired
    private FlowTrendAvgRepository flowTrendAvgRepository;
    @Test
    void getAllBetweenDates() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse("2017-11-25");
        Date end = sdf.parse("2017-12-02");
        System.out.println(flowTrendAvgRepository.getAllBetweenDates(start,end));

    }
}