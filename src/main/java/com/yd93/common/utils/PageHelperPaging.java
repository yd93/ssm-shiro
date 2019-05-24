package com.yd93.common.utils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.print.Doc;
import java.util.List;

/**
 * @description: Pagehelper插件进行分页的使用
 * @author: yd93
 * @createTime: 2019-05-15 12:33:51
 **/
public class PageHelperPaging {

    /**
     * @param currentPage：当前页
     * @param pageSize：页面大小
     * @param list：要分页的对象集合
     * @return：页面对象
     */
    public PageInfo<Doc> page(int currentPage, int pageSize, List list){
        PageHelper.startPage(currentPage,pageSize);
        PageInfo<Doc> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
