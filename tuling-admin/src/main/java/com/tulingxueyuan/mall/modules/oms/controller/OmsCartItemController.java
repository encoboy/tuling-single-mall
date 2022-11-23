package com.tulingxueyuan.mall.modules.oms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mall.common.api.CommonPage;
import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.dto.OrderConditonDTO;
import com.tulingxueyuan.mall.modules.oms.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 购物车表 前端控制器
 * </p>
 *
 * @author XuShu
 * @since 2022-11-23
 */
@RestController
@RequestMapping("/order")
public class OmsCartItemController {

    @Autowired
    OmsOrderService orderService;


    /**
     * 订单列表
     * /list?pageNum=1&pageSize=10
     * pageNum: 1,
     * pageSize: 10,
     * orderSn: null,
     * receiverKeyword: null,
     * status: null,
     * orderType: null,
     * sourceType: null,
     * createTime: null,
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult list(OrderConditonDTO condition) {
        Page page = orderService.list(condition);
        return CommonResult.success(CommonPage.restPage(page));
    }

}

