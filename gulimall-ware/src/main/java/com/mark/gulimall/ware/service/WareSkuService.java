package com.mark.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mark.common.utils.PageUtils;
import com.mark.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 23:03:22
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

