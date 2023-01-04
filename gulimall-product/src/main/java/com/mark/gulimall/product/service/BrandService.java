package com.mark.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mark.common.utils.PageUtils;
import com.mark.gulimall.product.entity.BrandEntity;


import java.util.Map;

/**
 * 品牌
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 19:56:05
 */

public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

