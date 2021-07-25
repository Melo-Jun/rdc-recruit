package com.rdc.controller;

import com.rdc.entity.AppNotice;
import com.rdc.service.AppNoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AppNotice)表控制层
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
@RestController
@RequestMapping("appNotice")
public class AppNoticeController {
    /**
     * 服务对象
     */
    @Resource
    private AppNoticeService appNoticeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AppNotice selectOne(Integer id) {
        return this.appNoticeService.queryById(id);
    }

}