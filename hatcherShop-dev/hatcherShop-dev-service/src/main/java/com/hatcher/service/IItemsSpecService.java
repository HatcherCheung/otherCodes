package com.hatcher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hatcher.entity.ItemsSpec;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 服务类
 * </p>
 *
 * @author HatcherCheung
 * @since 2021-10-05
 */
public interface IItemsSpecService extends IService<ItemsSpec> {

}
