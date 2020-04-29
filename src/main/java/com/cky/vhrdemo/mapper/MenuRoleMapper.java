package com.cky.vhrdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cky.vhrdemo.entity.MenuRole;
import org.apache.ibatis.annotations.Param;

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

    void deleteByRid(Integer rid);

    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
