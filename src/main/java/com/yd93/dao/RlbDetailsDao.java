package com.yd93.dao;

import com.yd93.model.RlbDetails;

import java.util.List;

/**
 * @description: 零售小票详情数据访问
 * @author: yd93
 * @createTime: 2019-05-14 11:23:25
 **/
public interface RlbDetailsDao {
    List<RlbDetails> getRlbDetails(String Name);
}
