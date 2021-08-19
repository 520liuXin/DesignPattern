package com.example.strategy.handler;


import com.example.strategy.entity.Order;

public interface OrderHandler {
    void handle(Order order);
}
