package com.tulingxueyuan.mall.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "首页类型导航栏数据", description = "首页类型导航栏数据")
public class HomeMenusDTO {
    @ApiModelProperty(value = "产品id")
    private Long id;
    @ApiModelProperty(value = "产品名称")
    private String name;
    @ApiModelProperty(value = "商品列表")
    private List<ProductDTO> productList;
}
