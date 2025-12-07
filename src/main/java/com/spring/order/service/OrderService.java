package com.spring.order.service;

import com.spring.order.model.OrderEntity;
import com.spring.order.model.OrderRequest;
import com.spring.order.model.OrderResponse;
import com.spring.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public String saveOrder(OrderRequest orderRequest) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setProductId(orderRequest.getProductId());
        orderEntity.setQuantity(orderRequest.getQuantity());
        orderEntity.setPrice(orderRequest.getPrice());
        orderEntity.setProductName(orderRequest.getProductName());
        orderRepository.save(orderEntity);
        return "Order saved successfully!";
    }

    public List<OrderResponse> viewOrders() {
        List<OrderResponse> orderResponseList = new ArrayList<>();
        orderRepository.findAll().forEach(orderEntity -> {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setProductId(orderEntity.getProductId());
            orderResponse.setQuantity(orderEntity.getQuantity());
            orderResponse.setPrice(orderEntity.getPrice());
            orderResponse.setProductName(orderEntity.getProductName());
            orderResponseList.add(orderResponse);
        });
        return orderResponseList;
    }
}
