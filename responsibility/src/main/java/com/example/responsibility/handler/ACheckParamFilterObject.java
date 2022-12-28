package com.example.responsibility.handler;

import com.example.responsibility.entity.Request;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 参数校验对象
 **/
@Component
@Order(1) //顺序排第1，最先校验
public class ACheckParamFilterObject extends AbstractHandler {
    @Override
    public void doFilter(Request request) {
        System.out.println("非空参数检查");
    }
}
