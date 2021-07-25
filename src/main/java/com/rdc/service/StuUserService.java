package com.rdc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rdc.entity.AppNotice;
import com.rdc.entity.StuUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (StuUser)表服务接口
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
@Service
public interface StuUserService extends IService<StuUser> {

    /**
     * 通过ID查询单条数据
     *
     * @param openId 主键
     * @return 实例对象
     */
    StuUser queryById(String openId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StuUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stuUser 实例对象
     * @return 实例对象
     */
    StuUser insert(StuUser stuUser);

    /**
     * 修改数据
     *
     * @param stuUser 实例对象
     * @return 实例对象
     */
    StuUser update(StuUser stuUser);

    /**
     * 通过主键删除数据
     *
     * @param openId 主键
     * @return 是否成功
     */
    boolean deleteById(String openId);

}