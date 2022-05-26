package com.hhp.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
@TableName("money")
public class Money {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Long money;

    @TableField(value = "is_deleted")
    private Integer isDeleted;

    @TableField(value = "create_at")
    private Timestamp createAt;

    @TableField(value = "update_at")
    private Timestamp updateAt;

}
