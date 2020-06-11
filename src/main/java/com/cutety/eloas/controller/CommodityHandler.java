package com.cutety.eloas.controller;

import com.cutety.eloas.entity.Category;
import com.cutety.eloas.entity.Commodity;
import com.cutety.eloas.repository.CommodityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commodity")
public class CommodityHandler {
    @Autowired
    private CommodityRepository commodityRepository;
    @GetMapping("/buy/{date}")
    List<Commodity> getBuyTop(@PathVariable("date") String date){
        return commodityRepository.findBuyTop(date);
    }
    @GetMapping("/cart/{date}")
    List<Commodity> getCartTop(@PathVariable("date") String date){
        return commodityRepository.findCartTop(date);
    }
    @GetMapping("/fav/{date}")
    List<Commodity> getFavTop(@PathVariable("date") String date){
        return commodityRepository.findFavTop(date);
    }
    @GetMapping("/pv/{date}")
    List<Commodity> getPvTop(@PathVariable("date") String date){
        return commodityRepository.findPvTop(date);
    }
}
