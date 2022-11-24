package com.tulingxueyuan.mall.modules.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tulingxueyuan.mall.modules.oms.model.OmsOrderSetting;

/**
 * <p>
 * 订单设置表 服务类
 * </p>
 *
 * @author XuShu
 * @since 2022-11-23
 */
public interface OmsOrderSettingService extends IService<OmsOrderSetting> {

    boolean update(Long id, OmsOrderSetting orderSetting);
}
