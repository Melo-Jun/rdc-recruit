package com.rdc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rdc.entity.AppNotice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (AppNotice)表服务接口
 *
 * @author makejava
 * @since 2021-07-25 11:39:29
 */
@Service
public interface AppNoticeService extends IService<AppNotice> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppNotice queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AppNotice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param appNotice 实例对象
     * @return 实例对象
     */
    AppNotice insert(AppNotice appNotice);

    /**
     * 修改数据
     *
     * @param appNotice 实例对象
     * @return 实例对象
     */
    AppNotice update(AppNotice appNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}