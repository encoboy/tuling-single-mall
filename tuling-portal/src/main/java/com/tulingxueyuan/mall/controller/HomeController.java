package com.tulingxueyuan.mall.controller;

import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.dto.HomeGoodsSaleDTO;
import com.tulingxueyuan.mall.dto.HomeMenusBannerDTO;
import com.tulingxueyuan.mall.dto.HomeMenusDTO;
import com.tulingxueyuan.mall.dto.ProductDTO;
import com.tulingxueyuan.mall.modules.oms.service.OmsCartItemService;
import com.tulingxueyuan.mall.modules.pms.service.PmsProductCategoryService;
import com.tulingxueyuan.mall.modules.pms.service.PmsProductService;
import com.tulingxueyuan.mall.modules.sms.model.SmsHomeAdvertise;
import com.tulingxueyuan.mall.modules.sms.service.SmsHomeAdvertiseService;
import com.tulingxueyuan.mall.modules.sms.service.SmsHomeCategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 *
 * 首页控制器
 */
@RestController
@Api(tags = "HomeController", description = "首页内容管理")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    OmsCartItemService cartItemService;
    @Autowired
    PmsProductCategoryService productCategoryService;
    @Autowired
    SmsHomeAdvertiseService homeAdvertiseService;
    @Autowired
    SmsHomeCategoryService homeCategoryService;
    @Autowired
    PmsProductService pmsProductService;

    /**
     * 获取首页类型导航栏和数据
     * get("/home/menus")
     */
    @RequestMapping(value = "/menus_banner", method = RequestMethod.GET)
    public CommonResult getMenus() {
        // 获取分类导航数据列表
        List<HomeMenusDTO> list = productCategoryService.getMenus();
        // 获取banner轮播图数据
        List<SmsHomeAdvertise> homeAdvertisesList = homeAdvertiseService.getHomeBanners();
        HomeMenusBannerDTO homeMenusBannerDTO = new HomeMenusBannerDTO();
        homeMenusBannerDTO.setHomeMenusList(list);
        homeMenusBannerDTO.setHomeAdvertisesList(homeAdvertisesList);
        return CommonResult.success(homeMenusBannerDTO);
    }

    /**
     * goods_sale
     */
    @RequestMapping(value = "/goods_sale", method = RequestMethod.GET)
    public CommonResult getGoodsSale() {
        List<HomeGoodsSaleDTO> list = homeCategoryService.getGoodsSale();
        return CommonResult.success(list);
    }


    /**
     * 商品搜索
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public CommonResult searchGoods(@RequestParam(value = "keyword", required = false) String keyword) {
        List<ProductDTO> list = pmsProductService.getProduct(keyword);
        return CommonResult.success(list);
    }


}
