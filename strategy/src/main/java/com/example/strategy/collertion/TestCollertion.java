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


    public static void main(String[] args) {
        int n=5;
        System.out.println(firstBadVersion(n));

    }


    public static int firstBadVersion(int n) {
        int left=1;
        int right=n;
        while (left<right){
            int middle=left+(right-left)/2;
            if(isBadVersion(middle)){
                right=middle;
            }else {
                left=middle+1;
            }
        }
        return right;
    }



    public static boolean isBadVersion(int version){
        if(version>3){
            return true;
        }

        return false;
    }


}

