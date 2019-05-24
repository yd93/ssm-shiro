package com.yd93.common.utils;

import com.yd93.model.User;
import com.yd93.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: shiro域管理
 * @author: yd93
 * @createTime: 2019-05-23 10:16:35
 **/
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    /**
     * 获取授权信息
     * @param principals
     * @return 权限设置信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取用户名
        String userName = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //进行授权角色
        authorizationInfo.setRoles(userService.getRoles(userName));
        //进行授权权限
        authorizationInfo.setStringPermissions(userService.getPermissions(userName));
        return authorizationInfo;
    }

    /**
     * 角色身份验证
     * @param token
     * @return 返回角色验证信息
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userName = (String) token.getPrincipal();
        User user = userService.getByUserName(userName);
        if (user != null){
//            return new SimpleAuthenticationInfo(user.getUserName(),
//                    user.getPassword(), ByteSource.Util.bytes(user.getUserName()), getName());
         return new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),getName());
        }else{
            throw new ExpiredCredentialsException();
        }
    }
}
