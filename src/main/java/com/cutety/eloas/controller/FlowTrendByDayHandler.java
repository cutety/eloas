package com.cutety.eloas.controller;

import com.cutety.eloas.entity.FlowTrendByDay;
import com.cutety.eloas.entity.NewUserTrendByDay;
import com.cutety.eloas.repository.FlowTrendByDayRepository;
import com.cutety.eloas.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,21:09.
 **/
@RestController
@RequestMapping("/flowTrendByDay")
public class FlowTrendByDayHandler {
    @Autowired
    private FlowTrendByDayRepository flowTrendByDayRepository;
    @GetMapping("/findAll")
    public List<FlowTrendByDay> findAll(){
        return flowTrendByDayRepository.findAll();
    }
    @GetMapping("/history")
    public FlowTrendByDay history(){
        return flowTrendByDayRepository.findById(18).get();
    }
    @GetMapping("/findByDate/{sDate}/{eDate}")
    public List<FlowTrendByDay> findAllByDate(@PathVariable("sDate") String sDate, @PathVariable("eDate") String eDate) throws ParseException {
        return flowTrendByDayRepository.getAllBetweenDates(DateUtil.string2Date(sDate),DateUtil.string2Date(eDate));
    }
    @GetMapping("/findByPage/{page}/{size}")
    public Page<FlowTrendByDay> findByPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return flowTrendByDayRepository.findAll(pageRequest);
    }
}
