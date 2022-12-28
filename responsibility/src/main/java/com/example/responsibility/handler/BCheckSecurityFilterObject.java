package com.example.responsibility.handler;

import com.example.responsibility.entity.Request;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2) //校验顺序排第2
public class BCheckSecurityFilterObject extends AbstractHandler {
    @Override
    public void doFilter(Request request) {
        //invoke Security check
        System.out.println("安全调用校验");
    }
}