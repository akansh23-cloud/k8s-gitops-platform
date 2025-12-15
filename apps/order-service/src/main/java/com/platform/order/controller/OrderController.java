package com.platform.order.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public Map<String, Object> getOrder() {
        Map<String, Object> res = new HashMap<>();
        res.put("orderId", UUID.randomUUID().toString());
        res.put("status", "CREATED");
        res.put("service", "order-service");
        return res;
    }
}
