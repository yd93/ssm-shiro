package com.yd93.service;

import com.yd93.model.ProdClsf;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 商品信息业务
 * @author: yd93
 * @createTime: 2019-05-14 11:50:35
 **/
public interface ProdClsfService {
    List<ProdClsf> getProduct();
}
