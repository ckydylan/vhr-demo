package com.cky.vhrdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cky.vhrdemo.entity.Joblevel;
import com.cky.vhrdemo.mapper.JoblevelMapper;
import com.cky.vhrdemo.service.JoblevelService;
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
 * @since 2020-04-25
 */
@Service
public class JoblevelServiceImpl extends ServiceImpl<JoblevelMapper, Joblevel> implements JoblevelService {
    @Resource
    JoblevelMapper jobLevelMapper;
    @Override
    public List<Joblevel> getAllJobLevels() {
        return jobLevelMapper.getAllJobLevels();
    }

    @Override
    public Integer addJobLevel(Joblevel jobLevel) {
        jobLevel.setEnabled(true);
        jobLevel.setCreateDate(new Date());

        return jobLevelMapper.insert(jobLevel);
    }

    @Override
    public Integer updateJobLevelById(Joblevel jobLevel) {
        return jobLevelMapper.updateByPrimaryKey(jobLevel);
    }

    @Override
    public Integer deleteJobLevelById(Integer id) {
        return jobLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteJobLevelsByIds(Integer[] ids) {
        return jobLevelMapper.deleteJobLevelsByIds(ids);
    }
}
