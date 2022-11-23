package com.tulingxueyuan.mall.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "添加购物车参数接收对象", description = "添加购物车参数接收对象")
public class AddCarDTO {
    /**
     * productId: this.id,
     * productSkuId: this.skuId,
     * quantity: 1,
     */
    @ApiModelProperty("商品id")
    private Long productId;

    @ApiModelProperty("商品库存id")
    private Long productSkuId;
    
    @ApiModelProperty("数量")
    private Integer quantity;
}
