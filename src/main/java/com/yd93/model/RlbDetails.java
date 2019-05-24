package com.yd93.model;

import java.util.Date;

/**
 * @description: 零售小票详情
 * @author: yd93
 * @createTime: 2019-05-14 10:49:42
 **/
public class RlbDetails {
    private String unitName;
    private Integer rlbNum;
    private Date docDate;
    private String prodNum;
    private String prodClsNum;
    private Integer color;
    private String spec;
    private Integer sysPrice;
    private Double discRate;
    private Double discRatePrice;
    private Integer sellQty;
    private Double sellVal;
    private Double discSellVal;
    private String prsnlNum;
    private Date tranlTime;
    private String vip;
    private String salesMan;
    private String remarks;

    public RlbDetails() {
    }

    public RlbDetails(String unitName, Integer rlbNum, Date docDate, String prodNum, String prodClsNum, Integer color, String spec, Integer sysPrice, Double discRate, Double discRatePrice, Integer sellQty, Double sellVal, Double discSellVal, String prsnlNum, Date tranlTime, String vip, String salesMan, String remarks) {
        this.unitName = unitName;
        this.rlbNum = rlbNum;
        this.docDate = docDate;
        this.prodNum = prodNum;
        this.prodClsNum = prodClsNum;
        this.color = color;
        this.spec = spec;
        this.sysPrice = sysPrice;
        this.discRate = discRate;
        this.discRatePrice = discRatePrice;
        this.sellQty = sellQty;
        this.sellVal = sellVal;
        this.discSellVal = discSellVal;
        this.prsnlNum = prsnlNum;
        this.tranlTime = tranlTime;
        this.vip = vip;
        this.salesMan = salesMan;
        this.remarks = remarks;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getRlbNum() {
        return rlbNum;
    }

    public void setRlbNum(Integer rlbNum) {
        this.rlbNum = rlbNum;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getSysPrice() {
        return sysPrice;
    }

    public void setSysPrice(Integer sysPrice) {
        this.sysPrice = sysPrice;
    }

    public Double getDiscRate() {
        return discRate;
    }

    public void setDiscRate(Double discRate) {
        this.discRate = discRate;
    }

    public Double getDiscRatePrice() {
        return discRatePrice;
    }

    public void setDiscRatePrice(Double discRatePrice) {
        this.discRatePrice = discRatePrice;
    }

    public Integer getSellQty() {
        return sellQty;
    }

    public void setSellQty(Integer sellQty) {
        this.sellQty = sellQty;
    }

    public Double getSellVal() {
        return sellVal;
    }

    public void setSellVal(Double sellVal) {
        this.sellVal = sellVal;
    }

    public Double getDiscSellVal() {
        return discSellVal;
    }

    public void setDiscSellVal(Double discSellVal) {
        this.discSellVal = discSellVal;
    }

    public String getPrsnlNum() {
        return prsnlNum;
    }

    public void setPrsnlNum(String prsnlNum) {
        this.prsnlNum = prsnlNum;
    }

    public Date getTranlTime() {
        return tranlTime;
    }

    public void setTranlTime(Date tranlTime) {
        this.tranlTime = tranlTime;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(String salesMan) {
        this.salesMan = salesMan;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
