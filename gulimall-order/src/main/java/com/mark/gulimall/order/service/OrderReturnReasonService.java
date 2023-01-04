package com.mark.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mark.common.utils.PageUtils;
import com.mark.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 22:52:20
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

