package com.cky.vhrdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cky.vhrdemo.entity.Hr;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: cky
 * @Date: 2020/4/17 13:04
 * @Description:
 */
public interface HrMapper extends BaseMapper<Hr> {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    @Select("select * from hr where username=#{username}")
    Hr loadUserByUsername(String username);

}
