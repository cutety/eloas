package com.cutety.eloas.controller;

import com.cutety.eloas.entity.BehaviorTrendByDay;
import com.cutety.eloas.entity.FlowTrendByDay;
import com.cutety.eloas.repository.BehaviorTrendByDayRepository;
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

@RestController
@RequestMapping("/userBehavior")
public class BehaviorTrendByDayHandler {
    @Autowired
    private BehaviorTrendByDayRepository behaviorTrendByDayRepository;
    @GetMapping("/findByDate/{sDate}/{eDate}")
    public List<BehaviorTrendByDay> findAllByDate(@PathVariable("sDate") String sDate, @PathVariable("eDate") String eDate) throws ParseException {
        return behaviorTrendByDayRepository.getAllBetweenDates(DateUtil.string2Date(sDate),DateUtil.string2Date(eDate));
    }
    @GetMapping("/findByPage/{page}/{size}")
    public Page<BehaviorTrendByDay> findByPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return behaviorTrendByDayRepository.findAll(pageRequest);
    }
}
