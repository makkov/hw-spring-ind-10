package com.example.hwspringind10.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Basket {

    //Хранение в виде id и количества их в корзине
    private final Map<Integer, Integer> countByOrderId = new HashMap<>();

    public Map<Integer, Integer> add(List<Integer> ids) {

        for (Integer i : ids) {
            if (countByOrderId.containsKey(i)) {
                countByOrderId.put(i, countByOrderId.get(i) + 1);
            } else {
                countByOrderId.put(i, 1);
            }
        }

        return countByOrderId;
    }

    public Map<Integer, Integer> get() {
        return countByOrderId;
    }
}
