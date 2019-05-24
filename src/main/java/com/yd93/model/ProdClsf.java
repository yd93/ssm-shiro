package com.yd93.model;

import java.util.Date;

/**
 * @description: 商品明细信息
 * @author: yd93
 * @createTime: 2019-05-14 11:14:11
 **/
public class ProdClsf {
    private String prodNum;
    private String prodClsNum;
    private String prodName;
    private String prodType;
    private Integer year;
    private Integer season;
    private String prodBoard;
    private String mktRgn;
    private Double sysPrice;
    private Date updateTime;
    private String color;
    private String spec;

    public ProdClsf() {
    }

    public ProdClsf(String prodNum, String prodClsNum, String prodName, String prodType, Integer year, Integer season, String prodBoard, String mktRgn, Double sysPrice, Date updateTime, String color, String spec) {
        this.prodNum = prodNum;
        this.prodClsNum = prodClsNum;
        this.prodName = prodName;
        this.prodType = prodType;
        this.year = year;
        this.season = season;
        this.prodBoard = prodBoard;
        this.mktRgn = mktRgn;
        this.sysPrice = sysPrice;
        this.updateTime = updateTime;
        this.color = color;
        this.spec = spec;
    }

    public String getProdNum() {
        return prodNum;
    }

    public void setProdNum(String prodNum) {
        this.prodNum = prodNum;
    }

    public String getProdClsNum() {
        return prodClsNum;
    }

    public void setProdClsNum(String prodClsNum) {
        this.prodClsNum = prodClsNum;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getProdBoard() {
        return prodBoard;
    }

    public void setProdBoard(String prodBoard) {
        this.prodBoard = prodBoard;
    }

    public String getMktRgn() {
        return mktRgn;
    }

    public void setMktRgn(String mktRgn) {
        this.mktRgn = mktRgn;
    }

    public Double getSysPrice() {
        return sysPrice;
    }

    public void setSysPrice(Double sysPrice) {
        this.sysPrice = sysPrice;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
