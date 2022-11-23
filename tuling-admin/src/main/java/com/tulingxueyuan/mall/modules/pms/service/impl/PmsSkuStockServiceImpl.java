package com.tulingxueyuan.mall.modules.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tulingxueyuan.mall.modules.pms.mapper.PmsSkuStockMapper;
import com.tulingxueyuan.mall.modules.pms.model.PmsSkuStock;
import com.tulingxueyuan.mall.modules.pms.service.PmsSkuStockService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * sku的库存 服务实现类
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
@Service
public class PmsSkuStockServiceImpl extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock> implements PmsSkuStockService {

    @Override
    public List<PmsSkuStock> list(Long pid, String keyword) {
        QueryWrapper<PmsSkuStock> pmsSkuStockQueryWrapper = new QueryWrapper<>();
        pmsSkuStockQueryWrapper.lambda().eq(PmsSkuStock::getProductId, pid);
        if (!StringUtils.isEmpty(keyword)) {
            // like模糊搜索
            pmsSkuStockQueryWrapper.lambda().like(PmsSkuStock::getSkuCode, keyword);
        }
        return list(pmsSkuStockQueryWrapper);
    }
}
