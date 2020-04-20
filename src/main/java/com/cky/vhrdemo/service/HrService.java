package com.cky.vhrdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cky.vhrdemo.entity.Hr;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author: cky
 * @Date: 2020/4/17 13:07
 * @Description:
 */
public interface HrService extends IService<Hr>, UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
