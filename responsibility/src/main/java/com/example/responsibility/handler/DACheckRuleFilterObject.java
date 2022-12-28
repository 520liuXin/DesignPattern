package com.example.responsibility.handler;

import com.example.responsibility.entity.Request;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4) //校验顺序排第4
public class DACheckRuleFilterObject extends AbstractHandler {
    @Override
    public void doFilter(Request request) {
        //check rule
        System.out.println("check rule");
    }
}