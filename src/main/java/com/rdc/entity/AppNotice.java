package com.rdc.entity;


import java.util.Date;
import java.io.Serializable;

/**
 * (AppNotice)实体类
 *
 * @author myrdc
 * @since 2021-07-25 11:39:27
 */
public class AppNotice implements Serializable {
    private static final long serialVersionUID = 302557976120205820L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 通知内容
    */
    private String noticeContent;
    /**
    * 管理员用户id
    */
    private Integer adminId;
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

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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