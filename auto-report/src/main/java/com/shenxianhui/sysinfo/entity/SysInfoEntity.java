package com.shenxianhui.sysinfo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("sys_info")
public class SysInfoEntity {
    /** 信息 ID */
    @TableId("info_id")
    private String infoId;

    /** 用户 ID */
    @TableField("user_id")
    private String userId;
}
