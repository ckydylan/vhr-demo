package com.cky.vhrdemo.mapper;

import com.cky.vhrdemo.entity.HrRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dylan
 * @since 2020-04-19
 */
public interface HrRoleMapper extends BaseMapper<HrRole> {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);
}
