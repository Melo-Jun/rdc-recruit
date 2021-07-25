package com.rdc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rdc.entity.StuUser;
import com.rdc.dao.StuUserDao;
import com.rdc.service.StuUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StuUser)表服务实现类
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
@Service("stuUserService")
public class StuUserServiceImpl extends ServiceImpl<StuUserDao, StuUser> implements StuUserService {
    @Resource
    private StuUserDao stuUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param openId 主键
     * @return 实例对象
     */
    @Override
    public StuUser queryById(String openId) {
        return this.stuUserDao.queryById(openId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StuUser> queryAllByLimit(int offset, int limit) {
        return this.stuUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param stuUser 实例对象
     * @return 实例对象
     */
    @Override
    public StuUser insert(StuUser stuUser) {
        this.stuUserDao.insert(stuUser);
        return stuUser;
    }

    /**
     * 修改数据
     *
     * @param stuUser 实例对象
     * @return 实例对象
     */
    @Override
    public StuUser update(StuUser stuUser) {
        this.stuUserDao.update(stuUser);
        return this.queryById(stuUser.getOpenId());
    }

    /**
     * 通过主键删除数据
     *
     * @param openId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String openId) {
        return this.stuUserDao.deleteById(openId) > 0;
    }
}