package com.liuxin.demo.store.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liuxin.demo.store.service.ICommodity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 实物商品录入
 */
@Component
public class CouponCommodityService implements ICommodity {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        log.info("进入实物商品录入发奖模式");
    }
}
