package com.example.demo.bean;

import java.util.Date;


public class Project {

    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 开展项目、功效特色名称
     */
    private String name;

    /**
     * 项目、功效特色简介
     */
    private String content;

    /**
     * 数据区分
     */
    private String dataType;

    /**
     * 功效特色价格
     */
    private Integer price;

    /**
     * 数据状态
     */
    private String dataStatus;


    private String userCode;

    /**
     * 浏览次数
     */
    private Integer visitNum;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date itemcreateat;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    public Project() {
    }

    public Project(Integer itemid, String itemcode, String name, String content, String dataType, Integer price, String dataStatus, String userCode, Integer visitNum, String creater, Date itemcreateat, String updater, Date itemupdateat) {
        this.itemid = itemid;
        this.itemcode = itemcode;
        this.name = name;
        this.content = content;
        this.dataType = dataType;
        this.price = price;
        this.dataStatus = dataStatus;
        this.userCode = userCode;
        this.visitNum = visitNum;
        this.creater = creater;
        this.itemcreateat = itemcreateat;
        this.updater = updater;
        this.itemupdateat = itemupdateat;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getItemcreateat() {
        return itemcreateat;
    }

    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getItemupdateat() {
        return itemupdateat;
    }

    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }

    @Override
    public String toString() {
        return "Project{" +
                "itemid=" + itemid +
                ", itemcode='" + itemcode + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", dataType='" + dataType + '\'' +
                ", price=" + price +
                ", dataStatus='" + dataStatus + '\'' +
                ", userCode='" + userCode + '\'' +
                ", visitNum=" + visitNum +
                ", creater='" + creater + '\'' +
                ", itemcreateat=" + itemcreateat +
                ", updater='" + updater + '\'' +
                ", itemupdateat=" + itemupdateat +
                '}';
    }
}
