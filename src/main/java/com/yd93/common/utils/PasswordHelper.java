package com.yd93.common.utils;

import com.yd93.model.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.jupiter.api.Test;

/**
 * @description: 密码加密方法实现
 * @author: yd93
 * @createTime: 2019-05-24 09:43:24
 **/
class PasswordHelperTest {
    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private String algorithmName = "md5";
    private final int hashIterator = 1024;
    public void  encryptPassword(User user){
        String newPassword = new SimpleHash(algorithmName,user.getPassword(),null,hashIterator).toHex();

        System.out.println(newPassword);
        //user.setPassword(newPassword);
    }

    @Test
    public void test() {
        User user = new User();
        user.setUserName("jack");
        user.setPassword("123456");
        encryptPassword(user);
    }
}
