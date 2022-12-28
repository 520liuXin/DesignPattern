package com.example.responsibility.controller;

import com.example.responsibility.entity.Request;
import com.example.responsibility.handler.ChainPatternDemo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {
    @Resource
   private ChainPatternDemo chainPatternDemo;



    @GetMapping("/test")
    public void detail() {
        Request request =new Request();
        chainPatternDemo.exec(request);
    }



}
