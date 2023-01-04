package com.mark.gulimall.order.dao;

import com.mark.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 22:52:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
