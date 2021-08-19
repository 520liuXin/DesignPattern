package com.example.strategy.service;


import com.example.strategy.annotation.OrderHandlerType;
import com.example.strategy.annotation.OrderHandlerTypeImpl;
import com.example.strategy.entity.Order;
import com.example.strategy.handler.OrderHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
@Component
public class OrderService {


    //没有增加static导致调用是orderHandleMap为空
    private static  Map<OrderHandlerType, OrderHandler> orderHandleMap;

    @Resource

    public void setOrderHandleMap(List<OrderHandler> orderHandlers) {
        // 注入各种类型的订单处理类
        orderHandleMap = orderHandlers.stream().collect(
                Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class),
                        v -> v, (v1, v2) -> v1));
    }

    public void orderService(Order order) {
        // ...一些前置处理

        // 通过订单来源确定对应的handler
        OrderHandlerType orderHandlerType = new OrderHandlerTypeImpl(order.getSource(), order.getPayMethod());
        OrderHandler orderHandler = orderHandleMap.get(orderHandlerType);
        orderHandler.handle(order);


        // ...一些后置处理
    }
}
