-- 1. 表
create table sys_info
(
    info_id     bigint auto_increment comment '信息 ID'
        primary key,
    user_id     bigint                 not null comment '用户 ID',
    create_by   varchar(64) default '' null comment '创建者',
    create_time datetime               null comment '创建时间',
    update_by   varchar(64) default '' null comment '更新者',
    update_time datetime               null comment '更新时间',
    remark      varchar(500)           null comment '备注'
)
    comment '用户信息表';


commit;