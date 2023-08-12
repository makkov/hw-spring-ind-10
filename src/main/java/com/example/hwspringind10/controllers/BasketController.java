package com.example.hwspringind10.controllers;

import com.example.hwspringind10.servicies.BasketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BasketController {

    @ExceptionHandler({MethodArgumentTypeMismatchException.class, NumberFormatException.class})
    public String handleException(MethodArgumentTypeMismatchException e) {
        return "Не тот формат ввода";
    }

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
