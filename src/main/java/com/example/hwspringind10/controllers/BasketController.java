package com.example.hwspringind10.controllers;

import com.example.hwspringind10.servicies.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public Map<Integer, Integer> add(@RequestParam List<Integer> ids) {
        return basketService.add(ids);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> get() {
        return basketService.get();
    }
}
