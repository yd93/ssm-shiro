package com.yd93.controller;

import com.yd93.model.RlbDetails;
import com.yd93.service.RlbDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * @description: 零售小票控制器
 * @author: yd93
 * @createTime: 2019-05-14 13:52:51
 **/

@Controller
public class RlbDetailsController {

    /**注解扫描如果出现某些包没有进行扫描，则就会
     * 报没有注解生效，这里的service包，
     * 如果没有在<context:component-scan>这个标签里面声明扫描就造成注解不生效
     * */
    @Autowired
    RlbDetailsService rlbDetailsService;

    @RequestMapping("/rlb")
    public ModelAndView rlbDetailsControl(){
        List<RlbDetails> rlbDetails = rlbDetailsService.getRlb("公司展厅");
        ModelAndView mav = new ModelAndView("rlbDetails");
        mav.addObject("rlb",rlbDetails);
        return mav;
    }
}
