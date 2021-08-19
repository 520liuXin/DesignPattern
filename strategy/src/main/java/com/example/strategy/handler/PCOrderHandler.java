package com.example.strategy.handler;


import com.example.strategy.annotation.OrderHandlerType;
import com.example.strategy.entity.Order;

@OrderHandlerType(source = "PC",payMethod = "111")
public class PCOrderHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("处理PC端订单");
    }
}