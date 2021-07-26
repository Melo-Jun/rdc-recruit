package com.rdc.controller;

import com.rdc.entity.StuUser;
import com.rdc.service.StuUserService;
import com.rdc.utils.Result;
import com.rdc.utils.ResultCode;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (StuUser)表控制层
 *
 * @author myrdc
 * @since 2021-07-25 11:39:30
 */
@RestController
@RequestMapping("stuUser")
public class StuUserController {
    /**
     * 服务对象
     */
    @Resource
    private StuUserService stuUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StuUser selectOne(String id) {
        return this.stuUserService.queryById(id);
    }

    @GetMapping("openId")
    public Result getOpenId(String code) throws Exception {
        List<HashMap> openId = stuUserService.getOpenId(code);
        return Result.newResult(ResultCode.SUCCESS,openId);
    }

}