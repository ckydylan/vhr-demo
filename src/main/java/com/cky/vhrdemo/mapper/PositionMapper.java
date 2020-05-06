package com.cky.vhrdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cky.vhrdemo.entity.Position;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dylan
 * @since 2020-04-23
 */
public interface PositionMapper extends BaseMapper<Position> {
    int deleteByPrimaryKey(Integer id);

    @Override
    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    @Select("select * from position")
    List<Position> getAllPosition();

        @Delete({"<script> ",
            "delete from position where id in ",
            "<foreach collection='array' item='item' open='('  separator=',' close=')'>",
            "#{item}",
            "</foreach>",
            "</script>" })
    int deletePositionsByIds(Integer[] ids);

    Integer batchInsert(List<Position> positions);
}
