package com.rdc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (StuUser)实体类
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
public class StuUser implements Serializable {
    private static final long serialVersionUID = -48469796108574150L;
    /**
    * 微信号唯一标识
    */
    private String openId;
    /**
    * 学号
    */
    private String stuId;
    /**
    * 姓名
    */
    private String stuName;
    /**
    * 性别
    */
    private String stuSex;
    /**
    * 手机号
    */
    private String stuPhone;
    /**
    * 所属学院
    */
    private String stuAcademy;
    /**
    * 学生班级
    */
    private String stuClass;
    /**
    * 兴趣方向
    */
    private String stuDirection;
    /**
    * 自我介绍
    */
    private String stuIntroduction;
    /**
    * 学生考核进度
    */
    private Integer stuProcess;
    /**
    * 0:未删除;1:已删除
    */
    private Integer isDeleted;
    /**
    * 插入时间
    */
    private Date gmtCreate;
    /**
    * 最后修改时间
    */
    private Date gmtModified;


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuAcademy() {
        return stuAcademy;
    }

    public void setStuAcademy(String stuAcademy) {
        this.stuAcademy = stuAcademy;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuDirection() {
        return stuDirection;
    }

    public void setStuDirection(String stuDirection) {
        this.stuDirection = stuDirection;
    }

    public String getStuIntroduction() {
        return stuIntroduction;
    }

    public void setStuIntroduction(String stuIntroduction) {
        this.stuIntroduction = stuIntroduction;
    }

    public Integer getStuProcess() {
        return stuProcess;
    }

    public void setStuProcess(Integer stuProcess) {
        this.stuProcess = stuProcess;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
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