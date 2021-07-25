package com.rdc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rdc.entity.AppNotice;
import com.rdc.entity.StuNotice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (StuNotice)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
@Mapper
public interface StuNoticeDao extends BaseMapper<StuNotice> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StuNotice queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StuNotice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stuNotice 实例对象
     * @return 对象列表
     */
    List<StuNotice> queryAll(StuNotice stuNotice);

    /**
     * 新增数据
     *
     * @param stuNotice 实例对象
     * @return 影响行数
     */
    int insert(StuNotice stuNotice);

    /**
     * 修改数据
     *
     * @param stuNotice 实例对象
     * @return 影响行数
     */
    int update(StuNotice stuNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}