package com.tulingxueyuan.mall.dto;

import com.tulingxueyuan.mall.modules.sms.model.SmsHomeAdvertise;
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
@ApiModel(value = "首页类型导航栏和banner组合数据传输对象", description = "首页类型导航栏和banner数据")
public class HomeMenusBannerDTO {

    @ApiModelProperty(value = "导航栏列表")
    private List<HomeMenusDTO> homeMenusList;

    @ApiModelProperty(value = "轮播图列表")
    private List<SmsHomeAdvertise> homeAdvertisesList;
}
