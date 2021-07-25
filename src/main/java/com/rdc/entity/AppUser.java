package com.rdc.entity;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.io.Serializable;

/**
 * (AppUser)实体类
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
public class AppUser implements Serializable {
    private static final long serialVersionUID = 470944088605890003L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 学号
    */
    private String userId;
    /**
    * 用户姓名
    */
    private String userName;
    /**
    * 用户密码
    */
    private String firstPassword;
    /**
    * 管理员二级密码
    */
    private String secondPassword;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstPassword() {
        return firstPassword;
    }

    public void setFirstPassword(String firstPassword) {
        this.firstPassword = firstPassword;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
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