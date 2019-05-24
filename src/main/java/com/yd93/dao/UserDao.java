package com.yd93.dao;

import com.yd93.model.User;

import java.util.Set;

/**
 * @description: 用户数据访问接口
 * @author: yd93
 * @createTime: 2019-05-23 10:52:21
 **/
public interface UserDao {
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return 返回用户实体类
     */
    User getByUserName(String username);

    /**
     * 根据用户名获取角色信息
     * @param username
     * @return 返回角色集合
     */
    Set<String> getRoles(String username);

    /**
     * 根据用户名获取权限信息
     * @param username
     * @return 返回用户权限集合
     */
    Set<String> getPermissions(String username);
}
