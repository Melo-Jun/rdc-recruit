package com.rdc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rdc.entity.AppNotice;
import com.rdc.entity.StuUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (StuUser)表数据库访问层
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
@Mapper
public interface StuUserDao extends BaseMapper<StuUser> {

    /**
     * 通过ID查询单条数据
     *
     * @param openId 主键
     * @return 实例对象
     */
    StuUser queryById(String openId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StuUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stuUser 实例对象
     * @return 对象列表
     */
    List<StuUser> queryAll(StuUser stuUser);

    /**
     * 新增数据
     *
     * @param stuUser 实例对象
     * @return 影响行数
     */
    int insert(StuUser stuUser);

    /**
     * 修改数据
     *
     * @param stuUser 实例对象
     * @return 影响行数
     */
    int update(StuUser stuUser);

    /**
     * 通过主键删除数据
     *
     * @param openId 主键
     * @return 影响行数
     */
    int deleteById(String openId);

}