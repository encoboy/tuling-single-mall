package com.tulingxueyuan.mall.modules.sms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tulingxueyuan.mall.modules.sms.mapper.SmsHomeAdvertiseMapper;
import com.tulingxueyuan.mall.modules.sms.model.SmsHomeAdvertise;
import com.tulingxueyuan.mall.modules.sms.service.SmsHomeAdvertiseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 首页轮播广告表 服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2021-03-16
 */
@Service
public class SmsHomeAdvertiseServiceImpl extends ServiceImpl<SmsHomeAdvertiseMapper, SmsHomeAdvertise> implements SmsHomeAdvertiseService {

    @Override
    public List<SmsHomeAdvertise> getHomeBanners() {
        QueryWrapper<SmsHomeAdvertise> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(SmsHomeAdvertise::getType, 1)  //   图片  0 -> 是pc  1 -> 是移动端
                .eq(SmsHomeAdvertise::getStatus, 1) // 状态为 1 启用
                .orderByAsc(SmsHomeAdvertise::getSort);
        return this.list(queryWrapper);
    }
}
