package com.tulingxueyuan.mall.modules.pms.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 产品属性分类表
 * </p>
 *
 * @author XuShu
 * @since 2021-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pms_product_attribute_category")
@ApiModel(value = "PmsProductAttributeCategory对象", description = "产品属性分类表")
public class PmsProductAttributeCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @ApiModelProperty(value = "类型名称")
    private String name;

    @ApiModelProperty(value = "属性数量")
    private Integer attributeCount;

    @ApiModelProperty(value = "参数数量")
    private Integer paramCount;


}
