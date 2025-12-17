package com.spring.order.controller;

import com.spring.order.model.OrderRequest;
import com.spring.order.model.OrderResponse;
import com.spring.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<String> saveOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.saveOrder(orderRequest));
    }

    @GetMapping("/viewOrder")
    public ResponseEntity<OrderResponse> viewOrder(@RequestParam Long id) {
        return ResponseEntity.ok(orderService.viewOrder(id));
    }

    @GetMapping("/viewAllOrders")
    public ResponseEntity<List<OrderResponse>> viewAllOrders() {
        return ResponseEntity.ok(orderService.viewAllOrders());
    }
}
