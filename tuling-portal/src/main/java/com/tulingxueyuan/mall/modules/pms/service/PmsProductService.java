package com.tulingxueyuan.mall.modules.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tulingxueyuan.mall.dto.ProductDTO;
import com.tulingxueyuan.mall.dto.ProductDetailDTO;
import com.tulingxueyuan.mall.modules.pms.model.PmsProduct;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author XuShu
 * @since 2021-03-14
 */
public interface PmsProductService extends IService<PmsProduct> {

    /**
     * 取商品详情获
     *
     * @param id 商品id
     * @return
     */
    ProductDetailDTO getProductDetail(Long id);

    List<ProductDTO> getProduct(String keyword);
}
