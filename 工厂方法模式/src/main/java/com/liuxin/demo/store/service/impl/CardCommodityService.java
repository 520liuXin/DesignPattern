package com.liuxin.demo.store.service.impl;


import com.liuxin.demo.store.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 优惠券录入
 */
@Component
public class CardCommodityService implements ICommodity {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 优惠券发奖入口
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     * @throws Exception
     */
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        log.info("进入优惠券发奖模式");

    }
}
