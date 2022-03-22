package com.shenxianhui.sysinfo.controller;

import com.shenxianhui.sysinfo.entity.SysInfoEntity;
import com.shenxianhui.sysinfo.model.SysInfoVo;
import com.shenxianhui.sysinfo.service.SysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sysinfo/SysInfo")
public class SysInfoController {
    @Autowired
    private SysInfoService sysInfoService;

    @GetMapping("querySysInfoList")
    public List<SysInfoEntity> querySysInfoList(@RequestBody SysInfoVo sysInfoVo) throws Exception {
        return sysInfoService.querySysInfoList(sysInfoVo);
    }
}
