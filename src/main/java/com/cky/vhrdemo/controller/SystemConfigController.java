package com.cky.vhrdemo.controller;

/**
 * @Author: cky
 * @Date: 2020/4/21 14:41
 * @Description:
 */

import com.cky.vhrdemo.entity.Menu;
import com.cky.vhrdemo.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    MenuServiceImpl menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId() {
        return menuService.getMenusByHrId();
    }
}
