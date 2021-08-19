package com.example.strategy.handler;


import com.example.strategy.annotation.OrderHandlerType;
import com.example.strategy.entity.Order;

@OrderHandlerType(source = "MOBILE",payMethod = "111")
public class MobileOrderHandler implements OrderHandler {

    @Override
    public void handle(Order order) {
        System.out.println("处理移动端订单");
    }
}
