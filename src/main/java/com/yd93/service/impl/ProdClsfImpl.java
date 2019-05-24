package com.yd93.service.impl;

import com.yd93.dao.ProdClsfDao;
import com.yd93.model.ProdClsf;
import com.yd93.service.ProdClsfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 业务逻辑实现
 * @author: yd93
 * @createTime: 2019-05-14 11:59:23
 **/
@Service
public class ProdClsfImpl implements ProdClsfService {

    @Autowired
    ProdClsfDao prodClsfDao;
    @Override
    public List<ProdClsf> getProduct() {
       //逻辑业务均可以在这里进行实现,本次这里只实现访问dao层
        List<ProdClsf> prodClsf;
        prodClsf = prodClsfDao.getProdClsf();
        return prodClsf;
    }
}
