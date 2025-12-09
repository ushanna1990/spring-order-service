package com.spring.order.controller;

import com.spring.order.model.OrderRequest;
import com.spring.order.model.OrderResponse;
import com.spring.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/saveOrder")
    public String saveOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.saveOrder(orderRequest);
    }

    @GetMapping("/viewOrders")
    public List<OrderResponse> viewOrders() { return orderService.viewOrders(); }
}
