package com.cky.vhrdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cky.vhrdemo.entity.Joblevel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dylan
 * @since 2020-04-25
 */
public interface JoblevelMapper extends BaseMapper<Joblevel> {
    int deleteByPrimaryKey(Integer id);

    @Override
    int insert(Joblevel record);

    int insertSelective(Joblevel record);

    Joblevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joblevel record);

    int updateByPrimaryKey(Joblevel record);

    @Select("select * from joblevel")
    List<Joblevel> getAllJobLevels();

    Integer deleteJobLevelsByIds(@Param("ids") Integer[] ids);
}
