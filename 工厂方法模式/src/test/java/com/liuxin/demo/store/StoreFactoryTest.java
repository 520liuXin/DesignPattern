package com.liuxin.demo.store;


import com.liuxin.demo.store.service.ICommodity;
import org.junit.Test;
import org.junit.runner.RunWith;



public class StoreFactoryTest {



    @Test
    public void getLearn() throws Exception {

        StoreFactory storeFactory = new StoreFactory();

        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432",
                "791098764902132", null);
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        commodityService_2.sendCommodity("10001", "EGM1023938910232121323432",
                "791098764902132", null);
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001", "EGM1023938910232121323432",
                "791098764902132", null);
//        ICommodity commodityService_4 = storeFactory.getCommodityService(4);
//        commodityService_4.sendCommodity("10001", "EGM1023938910232121323432",
//                "791098764902132", null);
    }
}