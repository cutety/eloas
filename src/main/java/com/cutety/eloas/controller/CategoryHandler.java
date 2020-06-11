package com.cutety.eloas.controller;

import com.cutety.eloas.entity.Category;
import com.cutety.eloas.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryHandler {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/buy/{date}")
    List<Category> getBuyTop(@PathVariable("date") String date) {
        return categoryRepository.findBuyTop(date);
    }

    @GetMapping("/cart/{date}")
    List<Category> getCartTop(@PathVariable("date") String date) {
        return categoryRepository.findCartTop(date);
    }

    @GetMapping("/fav/{date}")
    List<Category> getFavTop(@PathVariable("date") String date) {
        return categoryRepository.findFavTop(date);
    }

    @GetMapping("/pv/{date}")
    List<Category> getPvTop(@PathVariable("date") String date) {
        return categoryRepository.findPvTop(date);
    }
}
