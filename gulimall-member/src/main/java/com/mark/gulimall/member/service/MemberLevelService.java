package com.mark.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mark.common.utils.PageUtils;
import com.mark.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2023-01-03 22:42:32
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

