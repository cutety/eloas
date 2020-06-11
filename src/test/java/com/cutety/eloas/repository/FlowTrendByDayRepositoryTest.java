package com.cutety.eloas.repository;

import com.cutety.eloas.entity.FlowTrendByDay;
import com.cutety.eloas.entity.NewUserTrendByDay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:58.
 **/
@SpringBootTest
class FlowTrendByDayRepositoryTest {
    @Autowired
    private FlowTrendByDayRepository flowTrendByDayRepository;
    @Test
    void findAll(){
        System.out.println(flowTrendByDayRepository.findAll());
    }
    @Test
    void findById(){
        System.out.println( flowTrendByDayRepository.findById(18).get());
    }

    @Test
    void getAllBetweenDates() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse("2017-11-25");
        Date end = sdf.parse("2017-12-02");
        List<FlowTrendByDay> list = flowTrendByDayRepository.getAllBetweenDates(start,end);
        System.out.println(list);
    }
    @Test
    void findAllByPage(){
        PageRequest pageRequest = PageRequest.of(0, 7);
        Page<FlowTrendByDay> page = flowTrendByDayRepository.findAll(pageRequest);
        System.out.println("Page result："+page.getContent());
    }
}