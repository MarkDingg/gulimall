package com.mark.gulimall.coupon.dao;

import com.mark.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 22:07:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
