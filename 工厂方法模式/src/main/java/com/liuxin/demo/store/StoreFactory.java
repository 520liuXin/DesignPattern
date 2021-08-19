package com.liuxin.demo.store;

import com.liuxin.demo.store.service.ICommodity;
import com.liuxin.demo.store.service.impl.CardCommodityService;
import com.liuxin.demo.store.service.impl.CouponCommodityService;
import com.liuxin.demo.store.service.impl.GoodsCommodityService;

public class StoreFactory {


    public ICommodity getCommodityService(Integer commodityType) {
        switch (commodityType){
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CardCommodityService();
            default:
                throw new RuntimeException("不存在兑奖形式");

        }

    }

}
