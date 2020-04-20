package com.cky.vhrdemo.mapper;

import com.cky.vhrdemo.entity.MenuRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dylan
 * @since 2020-04-19
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);
}
