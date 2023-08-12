package com.example.hwspringind10.servicies;

import com.example.hwspringind10.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public Map<Integer, Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
