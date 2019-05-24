package com.yd93.service;

import com.yd93.model.RlbDetails;

import java.util.List;

/**
 * @description: 零售小票详情页面业务逻辑
 * @author: yd93
 * @createTime: 2019-05-14 12:20:56
 **/
public interface RlbDetailsService {
    List<RlbDetails> getRlb(String name);
}
