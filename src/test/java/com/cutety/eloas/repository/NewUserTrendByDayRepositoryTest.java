package com.cutety.eloas.repository;

import com.cutety.eloas.entity.NewUserTrendByDay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:45.
 **/
@SpringBootTest
class NewUserTrendByDayRepositoryTest {
    @Autowired
    private NewUserTrendByDayRepository newUserTrendByDayRepository;
    @Test
    void findAll(){
        System.out.println(newUserTrendByDayRepository.findAll());
    }
    @Test
    void findAllByPage(){
        PageRequest pageRequest = PageRequest.of(0, 7);
        Page<NewUserTrendByDay> page = newUserTrendByDayRepository.findAll(pageRequest);
        System.out.println("Page result："+page.getContent());
    }

    @Test
    void getAllBetweenDates() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse("2017-11-16");
        Date end = sdf.parse("2017-11-18");
        List<NewUserTrendByDay> list = newUserTrendByDayRepository.getAllBetweenDates(start,end);
        System.out.println(list);
    }


}