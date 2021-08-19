package com.liuxin.demo.store.service;

import java.util.Map;

/**
 *自定义发奖接口
 *
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
