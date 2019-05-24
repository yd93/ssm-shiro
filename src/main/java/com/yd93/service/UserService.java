package com.yd93.service;

import com.yd93.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @description: 用户业务处理
 * @author: yd93
 * @createTime: 2019-05-23 11:18:50
 **/
public interface UserService {
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return 返回用户实体类
     */
    User getByUserName(String username);

    /**
     * 根据用户名获取角色信息
     * @param username
     * @return 返回用户角色集合
     */
    Set<String> getRoles(String username);

    /**
     * 根据用户名获取权限信息
     * @param username
     * @return 返回用户权限集合
     */
    Set<String> getPermissions(String username);
}
