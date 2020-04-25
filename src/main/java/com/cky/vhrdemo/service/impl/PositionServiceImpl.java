package com.cky.vhrdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cky.vhrdemo.entity.Position;
import com.cky.vhrdemo.mapper.PositionMapper;
import com.cky.vhrdemo.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dylan
 * @since 2020-04-23
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements PositionService {
    @Resource
    PositionMapper positionMapper;
    @Override
    public List<Position> getAllPositions() {
        return positionMapper.getAllPosition();
    }

    @Override
    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }
    @Override
    public Integer updatePositions(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }
    @Override
    public Integer deletePositionById(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }
    @Override
    public Integer deletePositionsByIds(Integer[] ids) {
        return positionMapper.deletePositionsByIds(ids);
    }
}
