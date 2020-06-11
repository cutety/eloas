package com.cutety.eloas.controller;

import com.cutety.eloas.entity.*;
import com.cutety.eloas.repository.UserActRepository;
import com.cutety.eloas.repository.UserActResultRepository;
import com.cutety.eloas.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/userAct")
public class UserActHandler {
    @Autowired
    private UserActRepository userActRepository;
    @Autowired
    private UserActResultRepository userActResultRepository;
    @GetMapping("/findYesterday")
    public UserAct findYesterday() throws ParseException {
        return userActRepository.getAllAtDate("2017-12-03");
    }
    @GetMapping("/findByDate/{sDate}/{eDate}")
    public List<UserAct> findAllByDate(@PathVariable("sDate") String sDate, @PathVariable("eDate") String eDate) throws ParseException {
        return userActRepository.getAllBetweenDates(sDate,eDate);
    }
    @GetMapping("/findByPage/{page}/{size}")
    public Page<UserAct> findByPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return userActRepository.findAll(pageRequest);
    }
}
