package com.example.responsibility.handler;

import com.example.responsibility.entity.Request;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *  黑名单校验对象
 */
@Component
@Order(3) //校验顺序排第3
public class CCheckBlackFilterObject extends AbstractHandler {
    @Override
    public void doFilter(Request request) {
        //invoke black list check
        System.out.println("校验黑名单");
    }
}