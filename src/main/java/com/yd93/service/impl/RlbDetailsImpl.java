package com.yd93.service.impl;

import com.yd93.dao.RlbDetailsDao;
import com.yd93.model.RlbDetails;
import com.yd93.service.RlbDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 零售小票 详情业务处理
 * @author: yd93
 * @createTime: 2019-05-14 12:41:39
 **/
@Service
public class RlbDetailsImpl implements RlbDetailsService {
    @Autowired
    RlbDetailsDao rlbDetailsDao;
    @Override
    public List<RlbDetails> getRlb(String name) {
        List<RlbDetails> rlbDetails;
        rlbDetails = rlbDetailsDao.getRlbDetails(name);
        return rlbDetails;
    }
}
