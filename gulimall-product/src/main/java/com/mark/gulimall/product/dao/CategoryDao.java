package com.mark.gulimall.product.dao;

import com.mark.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 19:56:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
