package com.cky.vhrdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cky.vhrdemo.entity.Joblevel;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dylan
 * @since 2020-04-25
 */
public interface JoblevelService extends IService<Joblevel> {
     List<Joblevel> getAllJobLevels();

     Integer addJobLevel(Joblevel jobLevel);

     Integer updateJobLevelById(Joblevel jobLevel) ;

     Integer deleteJobLevelById(Integer id);

     Integer deleteJobLevelsByIds(Integer[] ids) ;
}
