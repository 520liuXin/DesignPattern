package com.liuxin.demo.store.service.impl;

import com.liuxin.demo.store.service.ICommodity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.util.Map;

/**
 * 第三方兑换卡
 */
@Component
public class GoodsCommodityService implements ICommodity {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        log.info("进入第三方兑换卡发奖模式");
    }
}
