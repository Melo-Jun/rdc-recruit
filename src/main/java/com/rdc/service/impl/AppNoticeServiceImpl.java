package com.rdc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rdc.entity.AppNotice;
import com.rdc.dao.AppNoticeDao;
import com.rdc.service.AppNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AppNotice)表服务实现类
 *
 * @author makejava
 * @since 2021-07-25 11:39:29
 */
@Service("appNoticeService")
public class AppNoticeServiceImpl extends ServiceImpl<AppNoticeDao, AppNotice> implements AppNoticeService {
    @Resource
    private AppNoticeDao appNoticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppNotice queryById(Integer id) {
        return this.appNoticeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AppNotice> queryAllByLimit(int offset, int limit) {
        return this.appNoticeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param appNotice 实例对象
     * @return 实例对象
     */
    @Override
    public AppNotice insert(AppNotice appNotice) {
        this.appNoticeDao.insert(appNotice);
        return appNotice;
    }

    /**
     * 修改数据
     *
     * @param appNotice 实例对象
     * @return 实例对象
     */
    @Override
    public AppNotice update(AppNotice appNotice) {
        this.appNoticeDao.update(appNotice);
        return this.queryById(appNotice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.appNoticeDao.deleteById(id) > 0;
    }
}