package com.yd93.controller;

import com.yd93.model.ProdClsf;
import com.yd93.service.ProdClsfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @description: 商品详情控制器
 * @author: yd93
 * @createTime: 2019-05-14 22:34:45
 **/
@Controller
public class ProdClsfController {
    @Autowired
    ProdClsfService prodClsfService;

    @RequestMapping("/prod")
    public ModelAndView prodClsfControl(){
        List<ProdClsf> prodClsfs = prodClsfService.getProduct();
        ModelAndView mav = new ModelAndView("prodClsf");
        mav.addObject("product",prodClsfs);
        return mav;
    }
}
