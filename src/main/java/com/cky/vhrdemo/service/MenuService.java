package com.cky.vhrdemo.service;

import com.cky.vhrdemo.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dylan
 * @since 2020-04-19
 */
public interface MenuService extends IService<Menu> {
    List<Menu> getMenusByHrId();
    List<Menu> getAllMenusWithRole();
}
