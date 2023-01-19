package com.example.demo.bean;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Hospital {
    /**
     * 自增id
     */
    private Integer itemID;

    /**
     * UUID
     */
    private String itemCode;

    /**
     * 国医堂名称
     */
    private String hospitalName;

    /**
     * 医院等级
     */
    private String hospital_name;

    /**
     * 等级
     */
    private String hospital_level;

    /**
     * 预约量
     */
    private Integer hospital_booking;

    /**
     * 评分
     */
    private Double hospital_source;

    /**
     * 距离（暂定）
     */
    private Integer hospital_distance;

    /**
     * 医院电话
     */
    private String hospital_phone;

    /**
     * 医院地址省份
     */
    private String hospital_pro;

    /**
     * 医院地址市
     */
    private String hospital_city;

    /**
     * 医院地址区
     */
    private String hospital_country;

    /**
     * 医院详细地址
     */
    private String hospital_adress;

    /**
     * 简介
     */
    private String introduce;

    /**
     * 数据状态
     */
    private String status;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Timestamp itemCreateAt;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Timestamp itemUpdateAt;

}
