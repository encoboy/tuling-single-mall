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
@ApiModel(value = "首页推荐类型及商品列表数据传输对象", description = "首页推荐类型及商品列表数据传输对象")
public class HomeGoodsSaleDTO {
    @ApiModelProperty(value = "分类名称")
    private String categoryName;
    @ApiModelProperty(value = "图片地址")
    private String pic;
    @ApiModelProperty(value = "链接地址")
    private String url;
    @ApiModelProperty(value = "产品列表")
    private List<ProductDTO> productList;

}
