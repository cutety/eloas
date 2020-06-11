package com.cutety.eloas.controller;

import com.cutety.eloas.entity.NewUserTrendByDay;
import com.cutety.eloas.repository.NewUserTrendByDayRepository;
import com.cutety.eloas.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:47.
 **/
@RestController
@RequestMapping("/newUser")
public class NewUserTrendByDayHandler {
    @Autowired
    private NewUserTrendByDayRepository newUserTrendByDayRepository;
    @GetMapping("/findByDate/{sDate}/{eDate}")
    public List<NewUserTrendByDay> findAllByDate(@PathVariable("sDate") String sDate, @PathVariable("eDate") String eDate) throws ParseException {
        return newUserTrendByDayRepository.getAllBetweenDates(DateUtil.string2Date(sDate),DateUtil.string2Date(eDate));
    }
    @GetMapping("/findByPage/{page}/{size}")
    public Page<NewUserTrendByDay> findByPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return newUserTrendByDayRepository.findAll(pageRequest);
    }

    @GetMapping("/findAll")
    public List<NewUserTrendByDay> findAll(){
        return newUserTrendByDayRepository.findAll();
    }
}
