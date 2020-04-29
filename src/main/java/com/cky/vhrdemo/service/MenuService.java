package com.cky.vhrdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cky.vhrdemo.entity.Menu;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dylan
 * @since 2020-04-19
 */
public interface MenuService extends IService<Menu> {
    List<Menu> getMenusByHrId();

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);

    boolean updateMenuRole(Integer rid, Integer[] mids);

}
