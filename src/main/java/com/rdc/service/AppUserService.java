package com.rdc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rdc.entity.AppNotice;
import com.rdc.entity.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (AppUser)表服务接口
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
@Service
public interface AppUserService extends IService<AppUser> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppUser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AppUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param appUser 实例对象
     * @return 实例对象
     */
    AppUser insert(AppUser appUser);

    /**
     * 修改数据
     *
     * @param appUser 实例对象
     * @return 实例对象
     */
    AppUser update(AppUser appUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}