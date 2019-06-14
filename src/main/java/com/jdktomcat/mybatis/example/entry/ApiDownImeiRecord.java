package com.jdktomcat.mybatis.example.entry;

import lombok.Data;

import java.util.Date;

/**
 * 类描述：下载IMEI记录信息
 *
 * @author 汤旗
 * @date 2019-06-14 17:52
 */
@Data
public class ApiDownImeiRecord {

    /**
     * 主键编号
     */
    private Long id;

    /**
     * 唯一性编码,md5(uuid+day+ad_id+imei)
     */
    private String code;

    /**
     * 日期，日期格式， YYYY-mm-dd
     */
    private String day;

    /**
     * 类别/平台，1：CPD推广；2：效果广告
     */
    private Integer platform;

    /**
     * 下载时间戳，时间格式 yyyy-MM-dd HH:mm:ss
     */
    private String downBegin;

    /**
     * 渠道，<br/>
     * 1.CPD推广分为：<br/>
     * ①广告联盟<br/>
     * <br/>
     * 2.效果广告分为：<br/>
     * ①vivo自有流量<br/>
     * ②广告联盟
     */
    private Integer channel;

    /**
     * 广告位/类型，<br/>
     * 1.CPD：<br/>
     * a)为广告联盟渠道时<br/>
     * ⑤开屏<br/>
     * ⑥插屏<br/>
     * ⑦Banner<br/>
     * ⑧原生<br/>
     * <br/>
     * 2.效果广告<br/>
     * a)为vivo自有流量渠道时<br/>
     * ⑨信息流<br/>
     * ⑩Banner<br/>
     * b)为广告联盟渠道时<br/>
     * ⑪开屏<br/>
     * ⑫插屏<br/>
     * ⑬Banner<br/>
     * ⑭原生
     */
    private Integer adPositionType;

    /**
     * 广告ID
     */
    private String adId;

    /**
     * 广告名称
     */
    private String adName;

    /**
     * 计划ID
     */
    private String planId;

    /**
     * 计划名称
     */
    private String planName;

    /**
     * 下载imei号，MD5加密
     */
    private String imei;

    /**
     * 账户UUID
     */
    private String uuid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 应用包名
     */
    private String appPackage;

}
