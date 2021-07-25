package com.rdc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rdc.dao.AppNoticeDao;
import com.rdc.entity.AppNotice;
import com.rdc.entity.StuNotice;
import com.rdc.dao.StuNoticeDao;
import com.rdc.service.StuNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StuNotice)表服务实现类
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
@Service("stuNoticeService")
public class StuNoticeServiceImpl extends ServiceImpl<StuNoticeDao, StuNotice> implements StuNoticeService {
    @Resource
    private StuNoticeDao stuNoticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public StuNotice queryById(Integer id) {
        return this.stuNoticeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StuNotice> queryAllByLimit(int offset, int limit) {
        return this.stuNoticeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stuNotice 实例对象
     * @return 实例对象
     */
    @Override
    public StuNotice insert(StuNotice stuNotice) {
        this.stuNoticeDao.insert(stuNotice);
        return stuNotice;
    }

    /**
     * 修改数据
     *
     * @param stuNotice 实例对象
     * @return 实例对象
     */
    @Override
    public StuNotice update(StuNotice stuNotice) {
        this.stuNoticeDao.update(stuNotice);
        return this.queryById(stuNotice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.stuNoticeDao.deleteById(id) > 0;
    }
}