package com.gp.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author weikang
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(value = { "handler" })
@TableName("purchase_goods")
public class PurchaseGoodsVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("purchase_id")
    private Integer purchaseId;

    @TableField("goods_id")
    private Integer goodsId;

    @TableField("count")
    private Integer count;

    @TableField(exist=false)
    private GoodsVo goodsVo;

    @TableField(exist=false)
    private PurchaseVo purchaseVo;
}
