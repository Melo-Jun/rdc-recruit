package com.rdc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rdc.entity.AppNotice;
import com.rdc.entity.StuNotice;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (StuNotice)表服务接口
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
@Service
public interface StuNoticeService extends IService<StuNotice> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StuNotice queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StuNotice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param stuNotice 实例对象
     * @return 实例对象
     */
    StuNotice insert(StuNotice stuNotice);

    /**
     * 修改数据
     *
     * @param stuNotice 实例对象
     * @return 实例对象
     */
    StuNotice update(StuNotice stuNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}