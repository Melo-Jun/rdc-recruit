package com.rdc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rdc.dao.AppNoticeDao;
import com.rdc.entity.AppNotice;
import com.rdc.entity.AppUser;
import com.rdc.dao.AppUserDao;
import com.rdc.service.AppUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AppUser)表服务实现类
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
@Service("appUserService")
public class AppUserServiceImpl extends ServiceImpl<AppUserDao, AppUser> implements AppUserService {
    @Resource
    private AppUserDao appUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppUser queryById(Integer id) {
        return this.appUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AppUser> queryAllByLimit(int offset, int limit) {
        return this.appUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param appUser 实例对象
     * @return 实例对象
     */
    @Override
    public AppUser insert(AppUser appUser) {
        this.appUserDao.insert(appUser);
        return appUser;
    }

    /**
     * 修改数据
     *
     * @param appUser 实例对象
     * @return 实例对象
     */
    @Override
    public AppUser update(AppUser appUser) {
        this.appUserDao.update(appUser);
        return this.queryById(appUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.appUserDao.deleteById(id) > 0;
    }
}