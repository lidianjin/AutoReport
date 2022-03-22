package com.shenxianhui.sysinfo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shenxianhui.sysinfo.entity.SysInfoEntity;
import com.shenxianhui.sysinfo.model.SysInfoVo;

import java.util.List;

public interface SysInfoService extends IService<SysInfoEntity> {

    List<SysInfoEntity> querySysInfoList(SysInfoVo sysInfoVo) throws Exception;

}
