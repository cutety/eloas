package com.cutety.eloas.controller;

import com.cutety.eloas.entity.BehaviorConversion;
import com.cutety.eloas.entity.BehaviorResult;
import com.cutety.eloas.entity.FlowTrendByDay;
import com.cutety.eloas.repository.BehaviorConversionRepository;
import com.cutety.eloas.repository.BehaviorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/behaviorConversion")
public class BehaviorConversionHandler {
    @Autowired
    private BehaviorConversionRepository behaviorConversionRepository;
    @Autowired
    private BehaviorRepository behaviorRepository;
    @GetMapping("/findAll")
    public List<BehaviorConversion> findAll(){
        return behaviorConversionRepository.findAll();
    }
    @GetMapping("/findByDate/{sDate}/{eDate}")
    public List<BehaviorResult> findByDate(@PathVariable("sDate") String sDate, @PathVariable("eDate") String eDate){
        return behaviorRepository.findByDate(sDate,eDate);
    }
}
