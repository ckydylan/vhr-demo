package com.cky.vhrdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cky.vhrdemo.entity.Hr;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/17 13:07
 * @Description:
 */
public interface HrService extends IService<Hr>, UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

     List<Hr> getAllHrs(String keywords);

     Integer updateHr(Hr hr);

     boolean updateHrRole(Integer hrid, Integer[] rids);

     Integer deleteHrById(Integer id);

     List<Hr> getAllHrsExceptCurrentHr();

     Integer updateHyById(Hr hr);

     boolean updateHrPasswd(String oldpass, String pass, Integer hrid);

     Integer updateUserface(String url, Integer id);
}
