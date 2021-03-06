package com.gp.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gp.vo.GoodsTypeVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author weikang
 * @since 2020-12-08
 */
public interface GoodsTypeDao extends BaseMapper<GoodsTypeVo> {
    GoodsTypeVo queryById(int id);

    Page<GoodsTypeVo> selectPageVo(@Param("pageVo") Page<GoodsTypeVo> pageVo,@Param("goodsTypeVo") GoodsTypeVo goodsTypeVo);
}
