package com.tulingxueyuan.mall.modules.pms.controller;


import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.modules.pms.model.PmsSkuStock;
import com.tulingxueyuan.mall.modules.pms.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * sku的库存 前端控制器
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
@RestController
@RequestMapping("/sku")
public class PmsSkuStockController {

    @Autowired
    PmsSkuStockService pmsSkuStockService;

    /**
     * 获取库存列表
     * url:'/sku/'+pid,
     * method:'get',
     * params:params
     */
    @RequestMapping(value = "/{pid}", method = RequestMethod.GET)
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid,
                                                   @RequestParam(value = "", required = false) String keyword
    ) {
        List<PmsSkuStock> list = pmsSkuStockService.list(pid, keyword);
        return CommonResult.success(list);
    }

}

