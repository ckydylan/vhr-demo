package com.cky.vhrdemo.service;

import com.cky.vhrdemo.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dylan
 * @since 2020-04-19
 */
public interface RoleService extends IService<Role> {
    List<Role> getAllRoles();

    Integer addRole(Role role);

    Integer deleteRoleById(Integer rid);
}
