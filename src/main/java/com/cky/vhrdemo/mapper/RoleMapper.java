package com.cky.vhrdemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cky.vhrdemo.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    @Select("select * from role")
    List<Role> getAllRoles();
}
