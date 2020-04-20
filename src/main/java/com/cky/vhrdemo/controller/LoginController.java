package com.cky.vhrdemo.controller;

import com.cky.vhrdemo.entity.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cky
 * @Date: 2020/4/17 13:14
 * @Description:
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }
}
