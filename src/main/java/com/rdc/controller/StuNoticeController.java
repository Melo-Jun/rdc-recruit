package com.rdc.controller;

import com.rdc.entity.StuNotice;
import com.rdc.service.StuNoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (StuNotice)表控制层
 *
 * @author makejava
 * @since 2021-07-25 11:39:30
 */
@RestController
@RequestMapping("stuNotice")
public class StuNoticeController {
    /**
     * 服务对象
     */
    @Resource
    private StuNoticeService stuNoticeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StuNotice selectOne(Integer id) {
        return this.stuNoticeService.queryById(id);
    }

}