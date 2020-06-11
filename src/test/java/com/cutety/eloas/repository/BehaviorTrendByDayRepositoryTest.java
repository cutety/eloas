package com.cutety.eloas.repository;

import com.cutety.eloas.entity.BehaviorTrendByDay;
import com.cutety.eloas.entity.FlowTrendByDay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BehaviorTrendByDayRepositoryTest {
    @Autowired
    private BehaviorTrendByDayRepository behaviorTrendByDayRepository;
    @Test
    void getAllBetweenDates() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse("2017-11-25");
        Date end = sdf.parse("2017-12-02");
        List<BehaviorTrendByDay> list = behaviorTrendByDayRepository.getAllBetweenDates(start,end);
        System.out.println(list);
    }
}