package com.shenxianhui.sysinfo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SysInfoVo {
    /** 信息 ID */
    @JsonProperty("infoId")
    private String infoId;

    /** 用户 ID */
    @JsonProperty("userId")
    private String userId;
}
