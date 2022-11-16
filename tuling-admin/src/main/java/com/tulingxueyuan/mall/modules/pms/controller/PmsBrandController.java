package com.tulingxueyuan.mall.modules.pms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.mall.common.api.CommonPage;
import com.tulingxueyuan.mall.common.api.CommonResult;
import com.tulingxueyuan.mall.modules.pms.model.PmsBrand;
import com.tulingxueyuan.mall.modules.pms.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
@RestController
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    PmsBrandService brandService;

    /**
     * 品牌数据列表
     * 在商品中进行共用
     * url:'/brand/list',
     * method:'get',
     * params:params
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult list(
            @RequestParam(value = "keyword", defaultValue = "") String keyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page page = brandService.list(keyword, pageNum, pageSize);

        return CommonResult.success(CommonPage.restPage(page));
    }

    /**
     * 品牌数据添加
     * url:'/brand/create',
     * method:'post',
     * params:params
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody PmsBrand pmsBrand) {
        boolean result = brandService.create(pmsBrand);
        if (result) {
            return CommonResult.success(result);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 获取详情
     * url:'/brand/'+id,
     * method:'get',
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult getBrand(@PathVariable Long id) {
        PmsBrand result = brandService.getById(id);
        return CommonResult.success(result);
    }

    /**
     * 更改
     * url:'/brand/update/'+id,
     * method:'post',
     * data:data
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public CommonResult update(@RequestBody PmsBrand pmsBrand) {
        boolean result = brandService.updateById(pmsBrand);
        if (result) {
            return CommonResult.success(result);
        } else {
            return CommonResult.failed();
        }
    }

    /**
     * 删除
     * url:'/brand/delete/'+id,
     * method:'get',
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult delete(@PathVariable Long id) {
        boolean result = brandService.removeById(id);
        if (result) {
            return CommonResult.success(result);
        } else {
            return CommonResult.failed();
        }
    }

}

