package com.cky.vhrdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cky.vhrdemo.entity.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dylan
 * @since 2020-04-19
 */
public interface MenuMapper extends BaseMapper<Menu> {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer id);
}
