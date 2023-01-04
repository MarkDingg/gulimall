package com.mark.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mark.common.utils.PageUtils;
import com.mark.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 22:52:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

