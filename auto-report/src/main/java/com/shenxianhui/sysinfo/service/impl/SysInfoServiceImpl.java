package com.shenxianhui.sysinfo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shenxianhui.sysinfo.entity.SysInfoEntity;
import com.shenxianhui.sysinfo.mapper.SysInfoMapper;
import com.shenxianhui.sysinfo.model.SysInfoVo;
import com.shenxianhui.sysinfo.service.SysInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysInfoServiceImpl extends ServiceImpl<SysInfoMapper, SysInfoEntity> implements SysInfoService {

    @Override
    public List<SysInfoEntity> querySysInfoList(SysInfoVo sysInfoVo) throws Exception {
        QueryWrapper<SysInfoEntity> queryWrapper = new QueryWrapper<>();
        return this.list(queryWrapper);
    }

}
