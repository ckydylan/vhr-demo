package com.cky.vhrdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cky.vhrdemo.entity.Position;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dylan
 * @since 2020-04-23
 */
public interface PositionService extends IService<Position> {
    List<Position> getAllPositions();

    Integer addPosition(Position position);

    Integer updatePositions(Position position);

    Integer deletePositionById(Integer id);

    Integer deletePositionsByIds(Integer[] ids);

    PageInfo<Position> getPositionByPage(Integer page , Integer size);

    int addPositions(List<Position> positions);
}
