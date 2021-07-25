package com.rdc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (StuNotice)实体类
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
public class StuNotice implements Serializable {
    private static final long serialVersionUID = -51229314379406271L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 通知内容
    */
    private String noticeContent;
    /**
    * 通知类型
    */
    private String noticeType;
    /**
    * 所属用户微信号唯一标识
    */
    private String openId;
    /**
    * 插入时间
    */
    private Date gmtCreate;
    /**
    * 最后修改时间
    */
    private Date gmtModified;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}