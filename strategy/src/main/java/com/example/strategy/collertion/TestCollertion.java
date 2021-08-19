package com.example.strategy.collertion;

import com.example.strategy.entity.Order;
import com.example.strategy.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestCollertion {

    @GetMapping("/test")
    public void detail() {
        Order order=new Order();
        order.setSource("PC");
        order.setPayMethod("111");
        OrderService orderService=new OrderService();
        orderService.orderService(order);
    }
}
