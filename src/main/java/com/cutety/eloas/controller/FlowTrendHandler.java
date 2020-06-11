package com.cutety.eloas.controller;

import com.cutety.eloas.entity.FlowTrend;
import com.cutety.eloas.entity.FlowTrendAvg;
import com.cutety.eloas.entity.NewUserTrendByDay;
import com.cutety.eloas.repository.FlowTrendAvgRepository;
import com.cutety.eloas.repository.FlowTrendRepository;
import com.cutety.eloas.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:17.
 **/
@RestController
@RequestMapping("/flowTrend")
public class FlowTrendHandler {
    @Autowired
    private FlowTrendRepository flowTrendRepository;
    @Autowired
    private FlowTrendAvgRepository  flowTrendAvgRepository;
    @GetMapping("/findAll")
    public List<FlowTrend> findAll(){
        return flowTrendRepository.findAll();
    }
    @GetMapping("/findYesterday")
    public List<FlowTrend> findYesterday() throws ParseException {
        Date date = DateUtil.string2Date("2017-12-03");
        return flowTrendRepository.getAllAtDate(date);
    }
    @GetMapping("findByDate/{sDate}/{eDate}")
    public List<FlowTrendAvg> findAllByDate(@PathVariable("sDate") String sDate, @PathVariable("eDate") String eDate) throws ParseException {
        return flowTrendAvgRepository.getAllBetweenDates(DateUtil.string2Date(sDate),DateUtil.string2Date(eDate));
    }
}
