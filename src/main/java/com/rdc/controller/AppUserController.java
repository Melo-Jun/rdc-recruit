package com.rdc.controller;

import com.rdc.entity.AppUser;
import com.rdc.service.AppUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AppUser)表控制层
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
@RestController
@RequestMapping("appUser")
public class AppUserController {
    /**
     * 服务对象
     */
    @Resource
    private AppUserService appUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AppUser selectOne(Integer id) {
        return this.appUserService.queryById(id);
    }

}