package com.yd93.controller;

import com.yd93.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 用户控制器类
 * @author: yd93
 * @createTime: 2019-05-23 10:39:55
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request){
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try{
            currentUser.login(token);
            Session session = currentUser.getSession();
            System.out.println(session);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("user",user);
            request.setAttribute("errorMsg", "用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("/logout")
    public ModelAndView logout(){
        ModelAndView md = new ModelAndView("login");

        //shiro销毁登录
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return md;
    }
}
