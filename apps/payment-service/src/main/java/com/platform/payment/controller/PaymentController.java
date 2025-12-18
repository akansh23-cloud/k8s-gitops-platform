package com.platform.payment.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public Map<String, Object> getPayment() {
        Map<String, Object> res = new HashMap<>();
        res.put("paymentId", UUID.randomUUID().toString());
        res.put("status", "APPROVED");
        res.put("service", "payment-service");
        return res;
    }
}
